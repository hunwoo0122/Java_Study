package org.example.day19.Stream;

//double[] list2 = {11.1, 22.2, 33.3, 44.4};
//list2를 stream에 넣어 각각 10을 더한 후
//전체를 합해서 출력

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        double[] list2 = {11.1, 22.2, 33.3, 44.4};

        // Stream을 사용하여 각 요소에 10을 더한 후 합계 출력
        double sum = Arrays.stream(list2)
                .map(n -> n + 10)
                .sum();

        System.out.println("합계: " + sum);
    }
}
