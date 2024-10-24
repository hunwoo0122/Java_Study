package org.example.day18.Lambda;

public class LambdaExample3 {
    public static void main(String[] args) {
        StringFunctionalInterface toUpperCase = input -> input.toUpperCase();
        String result = toUpperCase.convert("hello world");
        System.out.println("대문자로 변환된 문자열:" + result);

    }
}
