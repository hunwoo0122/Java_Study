package org.example.day18.DesignPattern;
class AClass {
    private String name;

    // 기본 생성자
    public AClass() {
        this.name = "AClass Object";
    }

    // 매개변수가 있는 생성자
    public AClass(String name) {
        this.name = name;
    }

    // 메서드
    public void display() {
        System.out.println("This is " + name);
    }
}

class BClass {
    private String name;

    // 기본 생성자
    public BClass() {
        this.name = "BClass Object";
    }

    // 매개변수가 있는 생성자
    public BClass(String name) {
        this.name = name;
    }

    // 메서드
    public void display() {
        System.out.println("This is " + name);
    }
}

public class ObjectFactory {
    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("A")) {
            return new AClass();
        } else if (objectType.equalsIgnoreCase("B")) {
            return new BClass();
        } else {
            return null;
        }
    }
}