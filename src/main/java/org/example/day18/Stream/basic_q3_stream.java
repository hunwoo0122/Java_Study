package org.example.day18.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_stream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");

        //1. 모든 요소를 대문자로 변환한 후, 길이가 4보다 큰 데이터의 리스트 생성
        List<String> upperCaseList = words.stream()
                .map(String::toUpperCase) // 람다 표현식으로 사용하면 ->로 사용됨
                .filter(x -> x.length() > 4)
                .collect(Collectors.toList());
        System.out.println("대문자로 변환 후 길이가 4보다 큰 단어: " + upperCaseList);

        // 2. 각 요소에 대해 "밍"을 붙인 후 리스트 생성
        List<String> appendedList = words.stream()
                .map(x -> x + "님")
                .collect(Collectors.toList());
        System.out.println("각 단어에 '님'을 붙인 리스트: " + appendedList);
    }
}
