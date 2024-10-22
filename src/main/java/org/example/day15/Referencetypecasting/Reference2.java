package org.example.day15.Referencetypecasting;

public class Reference2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck(); //Car(부모) <--- Truck(자식), Taxi(자식)
        Human person = new Human(); //Car, Truck상관없음.

        car = truck; // 부모클래스(개념적으로 크다.) <-- 자식클래스(개념적으로 작다.)
        truck = (Truck)car; //자식(작) <-- 부모(크) 부모클래스 car를 truck만큼 자르면 값을 삽입가능하다. 강제형변환
        //person = car; // 크다 작다 성립이 안돼서 값 삽입 불가능 상속이 아니면 개념적으로 완전히 다르기 때문에 형변환 불가능!!
        //public void call(Car c)
        //call(택시), call(트럭) : 가능
        //call(사람) : 불가능.!
    }
}
