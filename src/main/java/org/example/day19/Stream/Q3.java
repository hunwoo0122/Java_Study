package org.example.day19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

//범위의 값 1500~3500까지를 만들어 stream에 넣어
//전체의 평균을 구한 후 출력
public class Q3 {
    public static void main(String[] args) {
        double[] list2 = {11.1, 22.2, 33.3, 44.4};

        // Stream을 사용하여 각 요소에 10을 더한 후 합계 출력
        double sum = Arrays.stream(list2)
                .map(n -> n + 10)
                .sum();

        System.out.println("합계: " + sum);

        double average = IntStream.rangeClosed(1500, 3500)
                .average()
                .orElse(0);

        System.out.println("평균: " + average);
    }
}
