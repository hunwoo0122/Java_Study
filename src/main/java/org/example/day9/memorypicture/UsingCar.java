package org.example.day9.memorypicture;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        //Car(틀, class) --new--> car1 객체생성
        //car1 : 클래스의 인스턴스, 객체(object)
        //new로 객체생성한 경우 멤버변수가
        //힙영역에 만들어진다.
        //new할 때마다(객체 생성할 때마다 각각의 멤버변수들이
        //힙영역에 만들어진다.
        //선언하지 않으면 0으로 힙영역에 자동 초기화
        car1.size = 10;
        car1.speed = 20;
        //클래스의 인스턴스 car1 : 참조형 변수
        //주소(힙영역) --> 필드 접근(.) 가능, 메서드 호출 가능!
        System.out.println(car1.print());
        car1.hi();
        //메인에 지역변수 하나 선언
        int age = 100;
        System.out.println("내 나이는 " + age);
    }
}
