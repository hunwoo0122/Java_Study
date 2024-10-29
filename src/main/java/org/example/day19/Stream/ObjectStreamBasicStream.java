package org.example.day19.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ObjectStreamBasicStream {
    public static void main(String[] args) {
        //1. 정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
        //최대값, 최소값, 합계, 평균을 구하시오.
        System.out.println("----------1번 문제---------");
        Random random = new Random();

        IntStream randomIntegers = IntStream.generate(() -> random.nextInt(112) + 111)
                .limit(100); // 100개의 랜덤 정수 생성 (111~222 범위) generate는 생성하는 함수

        int max = randomIntegers.max().orElse(0);
        int min = randomIntegers.min().orElse(0);
        int sum = randomIntegers.sum();
        double average = randomIntegers.average().orElse(0);

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        //2. 실수값 200개를 11.1~55.5까지 랜덤하게 생성하여 전체 개수, 맨 앞의 값, 평균을 구하기
        System.out.println("----------2번 문제----------");

        DoubleStream randomDoubles = DoubleStream.generate(() -> 11.1 + (random.nextDouble() * (55.5 - 11.1)))
                .limit(200);

        DoubleSummaryStatistics stats = randomDoubles.summaryStatistics();

        System.out.println("전체 개수: " + stats.getCount());
        System.out.println("맨 앞의 값: " + stats.getMin());
        System.out.println("평균: " + stats.getAverage());

        //3. 먹고 싶은 음식 7개를 List<String>에 넣은 후, 스트림으로 만들고 글자가 3글자 이상인 것 들만 모아서 프린트
        System.out.println("----------3번 문제------------");
        List<String> foods = Arrays.asList("피자", "햄버거", "떡볶이", "초밥", "치킨");

        List<String> filteredFoods = foods.stream()
                .filter(food -> food.length() >= 3)
                .collect(Collectors.toList());

        System.out.println("3글자 이상 음식: " + filteredFoods);

        //4.가고 싶은 곳 5개를 String[]에 넣고, "산"으로 끝나는 것들만 모아 중간 출력 후 List<String>로 최종 모아 출력
        System.out.println("----------4번 문제------------");
        String[] places = {"지리산", "한라산", "부산", "서울", "덕유산"};

        List<String> filteredPlaces = Arrays.stream(places)
                .filter(place -> place.endsWith("산"))
                .peek(System.out::println) // 중간 출력
                .collect(Collectors.toList());

        System.out.println("산으로 끝나는 장소들: " + filteredPlaces);

        //5.List<Double>에서 최대값, 최소값, 합계, 평균 구하기
        System.out.println("----------5번 문제------------");
        List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);

        DoubleStream doubleStream = list.stream().mapToDouble(Double::doubleValue);

        double max2 = doubleStream.max().orElse(Double.NaN); // 최대값
        double min2 = doubleStream.min().orElse(Double.NaN); // 최소값
        double sum2 = doubleStream.sum(); // 합계
        OptionalDouble avg2 = doubleStream.average(); // 평균

        System.out.println("최대값: " + max2);
        System.out.println("최소값: " + min2);
        System.out.println("합계: " + sum2);
        System.out.println("평균: " + avg2.orElse(Double.NaN));

        //6. List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
        //   중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오
        System.out.println("----------6번 문제------------");
        List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);

        int min3 = list2.stream()
                .distinct()                // 중복 제거
                .sorted()                  // 오름차순 정렬
                .min(Comparator.naturalOrder()) // 최소값 찾기
                .orElseThrow();            // 값이 없을 경우 예외 발생

        System.out.println("최소값: " + min3);
    }
}
