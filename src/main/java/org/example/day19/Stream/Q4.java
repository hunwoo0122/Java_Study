package org.example.day19.Stream;

import java.util.Random;
import java.util.stream.IntStream;

//랜덤한 정수 값 3500부터 4000까지 만들어 stream에 넣어
//중복 제거후 오름차순으로 정렬 후 출력

public class Q4 {
    public static void main(String[] args) {
        Random random = new Random();

        // 랜덤한 정수 값 3500부터 4000까지 생성, 중복 제거 후 오름차순 정렬
        IntStream.generate(() -> random.nextInt(501) + 3500 )
                .distinct()
                .limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}
