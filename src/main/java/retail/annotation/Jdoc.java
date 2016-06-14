package retail.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Created by LiuYu on 2016/6/13.
 */
@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Jdoc {

    public String value() default "";

    public String doc() default "";

    /*声明此字段将引用n哪个类的某个字段*/
    public Class refClz() default Object.class;

    /*声明此字段将引用n哪个类的某个字段*/
    public String refField() default "";
}
