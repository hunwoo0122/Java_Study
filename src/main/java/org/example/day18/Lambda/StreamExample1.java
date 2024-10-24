package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //짝수만 필터링하여 출력
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
