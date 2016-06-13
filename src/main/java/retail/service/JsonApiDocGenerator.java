package retail.service;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import retail.annotation.Jdoc;
import retail.domain.MaoBuPrd;

import java.io.*;
import java.lang.reflect.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class JsonApiDocGenerator {

    static JsonGenerator jg;

    static Pattern getPattern = Pattern.compile("get(\\w+)");

    static{
        try {
            jg=new JsonFactory().createGenerator(System.out, JsonEncoding.UTF8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generate(String fileName,Object obj) throws Exception {
        String classPath = JsonApiDocGenerator.class.getClassLoader().getResource("").getPath();
        String srcPath = new File(classPath).getParentFile().getParentFile().getPath();

        String jsonDocSrcDirectory = srcPath + "\\src\\main\\resources\\jsondoc\\";

        File jsonFile = new File(jsonDocSrcDirectory+fileName+".json");
        File docFile = new File(jsonDocSrcDirectory+fileName+".txt");
        if(!jsonFile.exists())
            jsonFile.createNewFile();
        if(!docFile.exists())
            docFile.createNewFile();

        OutputStream out = new FileOutputStream(jsonFile);
        jg=new JsonFactory().createGenerator(out, JsonEncoding.UTF8);

        FileWriter docWriter = new FileWriter(docFile);

        jsonAndDoc(jg,docWriter,new MaoBuPrd());

        jg.flush();
        out.flush();
        out.close();

        docWriter.flush();
        docWriter.close();
    }

    static String jsonAndDoc(JsonGenerator jg, FileWriter docWriter,Object obj) throws Exception {

        jg.writeStartObject();

        Class objClz = obj.getClass();
        Method[] mds = objClz.getDeclaredMethods();

        for (Method md: mds){
            String mdName = md.getName();
            Matcher matcher = getPattern.matcher(mdName);
            if (matcher.matches()) {
                String CameledFieldName = matcher.group(1);
                String fieldName = CameledFieldName.substring(0,1).toLowerCase() + CameledFieldName.substring(1);
                Class filedType = md.getReturnType();
                Jdoc jDoc = objClz.getDeclaredField(fieldName).getAnnotation(Jdoc.class);
                String value = jDoc.value();
                String doc = jDoc.doc();

                jg.writeFieldName(fieldName);  docWriter.write(fieldName); docWriter.write(": "); docWriter.write(doc); docWriter.write("\n");
                if(isPrimitive(filedType)) {
                    if(isNumber(filedType)) {
                        jg.writeRawValue(value);
                    } else {
                        jg.writeString(value);
                    }
                } else if(filedType.equals(List.class) || filedType.equals(Array.class)) {
                    Type type = md.getGenericReturnType();
                    if(type instanceof ParameterizedType) // 【3】如果是泛型参数的类型
                    {
                        ParameterizedType pt = (ParameterizedType) type;
                        Class genericClazz = (Class)pt.getActualTypeArguments()[0];
                        jg.writeStartArray();
                        if(isPrimitive(genericClazz)) {
                            if(isNumber(genericClazz)) {
                                for(String v:value.split(",")) {
                                    jg.writeRawValue(v);
                                }
                            } else {
                                for(String v:value.split(",")) {
                                    jg.writeString(v);
                                }
                            }
                        } else {
                            jsonAndDoc(jg,docWriter,genericClazz.newInstance());
                        }
                        jg.writeEndArray();
                    }
                } else {
                    jsonAndDoc(jg, docWriter, filedType.newInstance());
                }
            }
        }

        jg.writeEndObject();

        return null;
    }


    static Class[] numberClzs = new Class[]{byte.class,short.class,int.class,long.class,float.class,double.class,Byte.class,Short.class,Integer.class,Long.class,Float.class,Double.class};
    static Class[] primitiveClzs = new Class[]{String.class,Byte.class,Short.class,Integer.class,Long.class,Character.class,Float.class,Double.class,Void.class};
    static boolean isPrimitive(Class clz) {
        if(clz.isPrimitive())
            return true;
        for(Class pmClz: primitiveClzs) {
            if(pmClz.equals(clz))
                return true;
        }
        return false;
    }

    static boolean isNumber(Class clz) {
        for(Class nmClz: numberClzs) {
            if(nmClz.equals(clz))
                return true;
        }
        return false;
    }
}
