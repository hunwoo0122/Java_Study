package org.example.day18.Lambda;

public class UseSumInterface {
    public static void main(String[] args) {
        SumInterface sum = (a, b) -> a + b;
        System.out.println(sum.add(100,200));

        SumInterface sum2 = (a, b) -> (a + 100) + (b - 100);
        System.out.println(sum2.add(100,200));

    }
}
