package retail.service;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import retail.annotation.Jdoc;

import java.io.*;
import java.lang.reflect.*;
import java.math.BigDecimal;
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
        jsonAndDoc(jg, docWriter, obj,obj.getClass());
        jg.writeEndObject();

        jg.flush();
        out.flush();
        out.close();

        docWriter.flush();
        docWriter.close();
    }

    static String jsonAndDoc(JsonGenerator jg, FileWriter docWriter, Object obj, Class objClz) throws Exception {

        Class superClz = objClz.getSuperclass();
        if(!superClz.equals(Object.class)) {
            jsonAndDoc(jg, docWriter, obj, superClz);
        }

//        Method[] mds = objClz.getDeclaredMethods();
        Field[] fields = objClz.getDeclaredFields();
        TypeVariable[] clzParmTypes = objClz.getTypeParameters();

        for (Field fd : fields) {
            String fieldName = fd.getName();
            Class filedType = fd.getType();
            Type fieldGType = fd.getGenericType();

            String value = "";
            String doc = "";
            Class refClz = Object.class;
            String refField = "";

            try {
                Jdoc jDoc = objClz.getDeclaredField(fieldName).getAnnotation(Jdoc.class);
                if(jDoc!=null) {
                    value = jDoc.value();
                    doc = jDoc.doc();
                    refClz = jDoc.refClz();
                    refField = jDoc.refField();
                } else {
                    continue;
                }
            } catch (NoSuchFieldException e) {
                continue;
            } catch (SecurityException e) {
                continue;
            }

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
                String getMethodFieldName = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                Method md = objClz.getDeclaredMethod("get"+getMethodFieldName);
                Class realClz = md.invoke(obj).getClass();
                jg.writeStartObject();
                jsonAndDoc(jg, docWriter, realClz.newInstance(),realClz);
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
                        jsonAndDoc(jg, docWriter, compClz.newInstance(),compClz);
                        jg.writeEndObject();
                    }
                    jg.writeEndArray();
                } else if (filedType.equals(List.class) || filedType.equals(Set.class)) {
                    if (fieldGType instanceof ParameterizedType) // 【3】如果是泛型参数的类型
                    {
                        ParameterizedType pt = (ParameterizedType) fieldGType;
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
                            jsonAndDoc(jg, docWriter, genericClazz.newInstance(),genericClazz);
                            jg.writeEndObject();
                        }
                        jg.writeEndArray();
                    }
                } else {
                    jg.writeStartObject();
                    jsonAndDoc(jg, docWriter, filedType.newInstance(),filedType);
                    jg.writeEndObject();
                }
            }
        }


        return null;
    }


    static Class[] numberClzs = new Class[]{byte.class, short.class, int.class, long.class, float.class, double.class, boolean.class, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigDecimal.class, Date.class};
    static Class[] primitiveClzs = new Class[]{String.class, Date.class, Byte.class, Short.class, Integer.class, Long.class, Character.class, Float.class, Double.class,BigDecimal.class, Boolean.class, Void.class};

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
