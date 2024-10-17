package org.example.day12.Inherit;

public class Usingtruck {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.color = "핑크";
        t.speed = 100;
        t.weight = 1;
        System.out.println(t);
        t.start();
        t.move();
        t.end();
    }
}
