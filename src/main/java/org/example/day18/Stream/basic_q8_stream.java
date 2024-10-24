package org.example.day18.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q8_stream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,3,4,4,5,5,6,8);
        List<Integer> overBigThree = arr.stream()
                .filter(x -> x>3)
                .distinct()
                .collect(Collectors.toList()); // collect가 int말고 Integer로밖에 적용이 안됨
        // 그래서 boxed()함수로 int를 Integer로 변환해줘야함
        System.out.println("중복을 제외한 3보다 큰수: " + overBigThree);

        double[] arr2 = {5.0, 3.0, 10.0, 33.0, 35.0};

        double sum = Arrays.stream(arr2).sum();

        System.out.println(sum);

        List<String> arr3 = Arrays.asList("정신과", "내과", "신경과", "정형외과");
        List<String> hospital = arr3.stream()
                .map(x -> x + "사무실")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(hospital);
    }
}
