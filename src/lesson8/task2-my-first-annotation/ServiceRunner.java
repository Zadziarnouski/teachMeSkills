package lesson8.myfirstannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ServiceRunner {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        inspectService(MyService.class);
    }

    static void inspectService(Class<?> serviceClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        if (serviceClass.isAnnotationPresent(Version.class)) {
            Version version = serviceClass.getAnnotation(Version.class);
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
