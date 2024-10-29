package org.example.day19.Stream;

import java.util.Arrays;


public class UseLoop {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x)); //맨 끝에!
        System.out.println("-----------");
        int sum = Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x)) //중간 결과 출력!
                .sum();
        System.out.println("-----------");
        System.out.println(sum);
    }
}