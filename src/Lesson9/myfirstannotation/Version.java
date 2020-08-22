package Lesson9.myfirstannotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Version {
    double version();
    String code() default "null";
}
