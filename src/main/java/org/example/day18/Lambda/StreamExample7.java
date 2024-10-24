package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","data","fig");
        //'a'를 포함하는 문자열만 필터링하여 출력

        words.stream()
                .filter(word -> word.contains("a"))
                .forEach(System.out::println);
    }
}
