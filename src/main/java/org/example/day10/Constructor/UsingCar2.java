package org.example.day10.Constructor;

public class UsingCar2 {
    public static void main(String[] args) {



        Car2 c1 = new Car2("테슬라", "검정", 140);
        System.out.println(c1);
        //System.out.println(c1.model + " " +c1.color + " " + c1.maxSpeed);
        c1.speedUp();

        Car c2 = new Car();
        //System.out.println(c2.model + " " +c2.color + " " + c2.maxSpeed);
        System.out.println(c2);
        c2.speedUp();
    }
}
