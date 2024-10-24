package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStream5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        words.stream() .map(x-> x.substring(0, 1))
                       .forEach(System.out::println);
    }
}
