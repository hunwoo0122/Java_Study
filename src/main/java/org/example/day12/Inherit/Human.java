package org.example.day12.Inherit;

public class Human {
    char gender;
    String name;

    public Human(char gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public void sleep() {
        System.out.println("잠자는 중.");
    }

    public void eat() {
        System.out.println("먹는 중.");
    }
}
class Man extends Human {
    int power;

    public Man(char gender, String name, int power) {
        //super()항상 맨 첫줄에 써야함.!
        super(gender, name);
        this.power = power;
    }

    //public 맨(){
    // super(); //상속받는 클래스에서 생성자 호출시
    //부모객체부터 먼저 만들어야 파생이 되므로
    //부모 클래스의 생성자부터 먼저 호출해야함.
    // }


    public void run() {
        System.out.println("빨리 달리다.");
    }
}
class Superman extends Man {
    public Superman(char gender, String name, int power) {
        super(gender, name, power);
    }

    //필드 : 성별, 이름, 힘크기(3개)
    //메서드 : 잠자다, 먹다, 달리다, 날아다니다(4개)
    public void fly() {
        System.out.println("우주를 날아다니다.");
    }

    @Override
    public String toString() {
        return "수퍼맨{" +
                "power=" + power +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}

class Woman extends Human{
    //public 우먼(){
    //super();
    //}
    int walk;


    public Woman(char gender, String name, int walk) {
        super(gender, name);
        this.walk = walk;
    }
}
class Wonderwoman extends Woman{

    int high;//점프 높게!

    public Wonderwoman(char gender, String name, int walk, int high) {
        super(gender, name, walk);
        this.high = high;
    }
    public String toString() {
        return "원더우먼{" +
                "high=" + high +
                ", walk=" + walk +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
