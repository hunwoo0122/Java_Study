package org.example.day18.Lambda;

public class LambdaExample5 {
    public static void main(String[] args) {
        // int subtract(int a, int b);
        DifferenceFunctionalInterface my = (a, b) -> a - b;
        int result = my.subtract(20, 5);
        System.out.println("두 숫자의 차이:" + result);
    }
}
