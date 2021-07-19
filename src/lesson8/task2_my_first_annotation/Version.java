package lesson8.task2_my_first_annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Version {
    double version();
    String code() default "null";
}
