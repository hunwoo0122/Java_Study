package org.example.day19.Stream;

import java.util.ArrayList;
import java.util.List;
//List<Double> list1 = new ArrayList<>(); 1000, 2000, 3000,
// 4000, 5000을 넣은 후
//list1을 stream에 넣어 각각 1000을 뺀 후
// 전체 출력
public class Q1 {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();

        // 값 추가
        list1.add(1000.0);
        list1.add(2000.0);
        list1.add(3000.0);
        list1.add(4000.0);
        list1.add(5000.0);
        //List<Double> list12 = Arrays.asList(1000.0, 2000.0, 3000.0
        // 40000.0, 5000.0)

        list1.stream()
                .map(n -> n - 1000)
                .forEach(System.out::println);
    }
}
