package org.example.day18.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //1. 3초과인 데이터만 모은 리스트 생성
        List<Integer> filteredList = numbers.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList());
        System.out.println("3초과 숫자: " + filteredList);

        //2. 각 요소에 대해 10을 곱한 후 리스트 생성
        List<Integer> multipliedList = numbers.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println("각 요소에 10을 곱한 숫자: " + multipliedList);
    }
}
