package org.example.day20.Algorithm;

import java.util.Arrays;

public class Max_Value {
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = {0, 31, 24, 10, 1, 9};
        //정렬한 후,
        //맨 끝값 * 두번째 끝값
        Arrays.sort(numbers);
        int answer = 0;
        answer = numbers[numbers.length - 1]
                * numbers[numbers.length - 2];
        System.out.println(answer);
    }
}
