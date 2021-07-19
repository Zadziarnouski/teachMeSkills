package lesson8.task2_my_first_annotation;

import lesson8.task2_my_first_annotation.Version;

@Version(version = 7.9, code = "New Service")
public class MyService {
    private double version;
    private String code;

    public MyService(double version, String code) {
        this.version = version;
        this.code = code;
    }

    MyService() {
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private void thisClassInfo() {
        System.out.println("Version = " + version + ", code = " + code);
        System.out.println("From private method");
        ;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
