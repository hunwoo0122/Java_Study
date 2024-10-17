package org.example.day12.Inherit2;

public class Person {
    String name = "홍길동";
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("클라크 켄트이(가) 밥을 먹습니다");
    }
}
class Man extends Person {
    int power;
    public Man(int age, String name, int power) {
        super(name, age);
        this.power = power;
    }

    public void run(){
        System.out.println("달리기를 하다.");
    }
}
class Superman extends Man {
    boolean sky;

    public Superman(String name, int age, int power, boolean sky) {
        super(age, name, power);
        this.sky = sky;
    }


    public void space() {
        System.out.println("클라크 켄트이(가) 우주를 날아갑니다.");
    }
    public void run() {
        System.out.println("클라크 켄트이(가) 빠르게 달립니다.");
    }
    public String toString() {
        return "Superman{" +
                "sky=" + sky +
                ", power=" + power +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}