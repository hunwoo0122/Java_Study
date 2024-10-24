package org.example.day18.Lambda;

public class LambdaExample4 {
    public static void main(String[] args) {
        StringLengthFunctionalInterface returnlength = input -> input.length();
        int result = returnlength.getLength("world");
        System.out.println(result);
    }
}
