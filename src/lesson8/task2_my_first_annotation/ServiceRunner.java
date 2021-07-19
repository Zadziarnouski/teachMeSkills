package lesson8.task2_my_first_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServiceRunner {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        inspectService();
    }

    static void inspectService() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        if (MyService.class.isAnnotationPresent(Version.class)) {
            Version version = MyService.class.getAnnotation(Version.class);
            System.out.println(version);
            MyService service = new MyService();
            service.setVersion(version.version());
            service.setCode(version.code());

            Method m = MyService.class.getDeclaredMethod("thisClassInfo");
            m.setAccessible(true);
            m.invoke(new MyService(), null);


        }

    }
}
