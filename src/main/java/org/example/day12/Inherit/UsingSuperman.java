package org.example.day12.Inherit;

public class UsingSuperman {
    public static void main(String[] args) {
        Superman s = new Superman('m', "클라크", 100);
        //s.gender = ;
        //s.name = ;
        //s.power = 100;

        System.out.println(s); //toString()

        s.run();
        s.eat();
        s.fly();
        s.sleep();
    }
}
