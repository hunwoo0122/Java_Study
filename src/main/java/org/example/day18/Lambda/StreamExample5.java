package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","date");

        //각 문자열의 첫 글자 추출하여 출력

        words.stream()
                .map(word -> word.substring(0, 1))
                .forEach(System.out::println);
    }
}
