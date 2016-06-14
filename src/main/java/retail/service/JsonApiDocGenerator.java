package retail.service;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import retail.annotation.Jdoc;

import java.io.*;
import java.lang.reflect.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class JsonApiDocGenerator {

    static JsonGenerator jg;

    static Pattern getPattern = Pattern.compile("get(\\w+)|is(\\w+)");

    static {
        try {
            jg = new JsonFactory().createGenerator(System.out, JsonEncoding.UTF8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 生成obj代表的json请求/相应文件，以及由obj中@Jdoc注解的值和文档
     * <p/>
     * 生成的json文件请使用idea的自带格式化进行格式化，快捷键"ctrl+alt+L".
     *
     * @param fileName 接口文档的名称，不包含任何后缀
     * @param obj      要生成json和doc的对象
     * @throws Exception
     */
    public static void generate(String fileName, Object obj) throws Exception {
        String classPath = JsonApiDocGenerator.class.getClassLoader().getResource("").getPath();
        String srcPath = new File(classPath).getParentFile().getParentFile().getPath();

        String jsonDocSrcDirectory = srcPath + "\\src\\main\\resources\\jsondoc\\";

        File jsonFile = new File(jsonDocSrcDirectory + fileName + ".json");
        File docFile = new File(jsonDocSrcDirectory + fileName + ".txt");
        if (!jsonFile.exists())
            jsonFile.createNewFile();
        if (!docFile.exists())
            docFile.createNewFile();

        OutputStream out = new FileOutputStream(jsonFile);
        jg = new JsonFactory().createGenerator(out, JsonEncoding.UTF8);

        FileWriter docWriter = new FileWriter(docFile);

        jg.writeStartObject();
        jsonAndDoc(jg, docWriter, obj);
        jg.writeEndObject();

        jg.flush();
        out.flush();
        out.close();

        docWriter.flush();
        docWriter.close();
    }

    static String jsonAndDoc(JsonGenerator jg, FileWriter docWriter, Object obj) throws Exception {

        Class objClz = obj.getClass();

        Class superClz = objClz.getSuperclass();
        if(!superClz.equals(Object.class)) {
            jsonAndDoc(jg, docWriter, superClz.newInstance());
        }

        Method[] mds = objClz.getDeclaredMethods();
        TypeVariable[] clzParmTypes = objClz.getTypeParameters();

        for (Method md : mds) {
            String mdName = md.getName();
            Matcher matcher = getPattern.matcher(mdName);
            if (matcher.matches()) {
                String CameledFieldName = matcher.group(1) != null ? matcher.group(1) : matcher.group(2);
                String fieldName = CameledFieldName.substring(0, 1).toLowerCase() + CameledFieldName.substring(1);
                md.invoke(obj);
                Class filedType = md.getReturnType();
                Type fieldGType = md.getGenericReturnType();

                Jdoc jDoc = objClz.getDeclaredField(fieldName).getAnnotation(Jdoc.class);
                String value = jDoc.value();
                String doc = jDoc.doc();
                Class refClz = jDoc.refClz();
                String refField = jDoc.refField();

                if (!refClz.equals(Object.class)) {
                    if (refField.equals("")) {
                        throw new RuntimeException(fieldName + "必须同时声明refClz和refField!");
                    }
                    Jdoc refJdoc = refClz.getDeclaredField(refField).getAnnotation(Jdoc.class);
                    value = refJdoc.value();
                    doc = refJdoc.doc();
                }

                jg.writeFieldName(fieldName);
                docWriter.write(fieldName);
                docWriter.write(": ");
                docWriter.write(doc);
                docWriter.write("\n");

                if (isClzParmType(clzParmTypes, fieldGType)) {
                    Class realClz = md.invoke(obj).getClass();
                    jg.writeStartObject();
                    jsonAndDoc(jg, docWriter, realClz.newInstance());
                    jg.writeEndObject();
                } else {
                    if (isPrimitive(filedType)) {
                        if (isNumber(filedType)) {
                            jg.writeRawValue(value);
                        } else {
                            jg.writeString(value);
                        }
                    } else if (filedType.isArray()) {
                        Class compClz = filedType.getComponentType();
                        jg.writeStartArray();
                        if (isPrimitive(compClz)) {
                            if (isNumber(compClz)) {
                                for (String v : value.split(",")) {
                                    jg.writeRawValue(v);
                                }
                            } else {
                                for (String v : value.split(",")) {
                                    jg.writeString(v);
                                }
                            }
                        } else {
                            jg.writeStartObject();
                            jsonAndDoc(jg, docWriter, compClz.newInstance());
                            jg.writeEndObject();
                        }
                        jg.writeEndArray();
                    } else if (filedType.equals(List.class) || filedType.equals(Set.class)) {
                        Type type = md.getGenericReturnType();
                        if (type instanceof ParameterizedType) // 【3】如果是泛型参数的类型
                        {
                            ParameterizedType pt = (ParameterizedType) type;
                            Class genericClazz = (Class) pt.getActualTypeArguments()[0];
                            jg.writeStartArray();
                            if (isPrimitive(genericClazz)) {
                                if (isNumber(genericClazz)) {
                                    for (String v : value.split(",")) {
                                        jg.writeRawValue(v);
                                    }
                                } else {
                                    for (String v : value.split(",")) {
                                        jg.writeString(v);
                                    }
                                }
                            } else {
                                jg.writeStartObject();
                                jsonAndDoc(jg, docWriter, genericClazz.newInstance());
                                jg.writeEndObject();
                            }
                            jg.writeEndArray();
                        }
                    } else {
                        jg.writeStartObject();
                        jsonAndDoc(jg, docWriter, filedType.newInstance());
                        jg.writeEndObject();
                    }
                }
            }
        }


        return null;
    }


    static Class[] numberClzs = new Class[]{byte.class, short.class, int.class, long.class, float.class, double.class, boolean.class, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Date.class};
    static Class[] primitiveClzs = new Class[]{String.class, Date.class, Byte.class, Short.class, Integer.class, Long.class, Character.class, Float.class, Double.class, Boolean.class, Void.class};

    static boolean isPrimitive(Class clz) {
        if (clz.isPrimitive())
            return true;
        for (Class pmClz : primitiveClzs) {
            if (pmClz.equals(clz))
                return true;
        }
        return false;
    }

    static boolean isNumber(Class clz) {
        for (Class nmClz : numberClzs) {
            if (nmClz.equals(clz))
                return true;
        }
        return false;
    }

    static boolean isClzParmType(Type[] types, Type type) {
        for (Type typ : types) {
            if (type.getClass().equals(typ.getClass())) {
                return true;
            }
        }
        return false;
    }
}
