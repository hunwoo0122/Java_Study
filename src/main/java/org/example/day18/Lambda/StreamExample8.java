package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample8 {
    public static void main(String[] args) {
        List<String>words = Arrays.asList("java","lambda","stream","example");

        //각 문자열의 길이를 계산하여 출력
        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
