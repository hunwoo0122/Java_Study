package org.example.day20.Algorithm;

public class Protractor {
    public static void main(String[] args) {
        int n = 45;
        if (0 < n && n < 90){
            System.out.println(1);
        } else if (n == 90) {
            System.out.println(2);
        } else if (n > 90 && n < 180){
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
