package org.example.day19.Stream;

import java.util.Arrays;

public class MakingBasicStream {
    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        //int[] ==> IntStream[정수, 정수, 정수]
        Arrays.stream(n)
                .forEach(System.out::println);

        System.out.println(
                Arrays.stream(n).sum()
        );
        //기본형스트림을 객체스트림을 변경할 때는
        //boxed()를 사용함.
    }
}
