package org.example.day18.Lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3,5,-1,7,-8,2);

        numbers.stream()
                .filter(n->n<0)
                .forEach(System.out::println);
    }
}
