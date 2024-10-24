package org.example.day18.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q7_stream {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        List<String> fruit = numbers.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(fruit);

        List<String> strings = Arrays.asList("apple","good","grape","ice","melon");
        List<String> word = strings.stream()
                .filter(x -> x.length() >= 5) // filter는 boolean형의 데이터타입만 받는게 가능 map은 boolean의외의 모든 데이터타입 받음
                .collect(Collectors.toUnmodifiableList());
        System.out.println(word);
    }
}
