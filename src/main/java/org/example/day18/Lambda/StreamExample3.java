package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //각 숫자에 2를 곱한 후 출력
        numbers.stream()
                .map(n->n*2)
                .forEach(System.out::println);
    }
}
