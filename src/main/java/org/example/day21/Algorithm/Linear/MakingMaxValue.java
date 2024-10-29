package org.example.day21.Algorithm.Linear;

import java.util.Arrays;

public class MakingMaxValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Solution5 s = new Solution5();
        int a = s.solution(numbers);
        System.out.println(a);
    }
}

class Solution5 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return result;
    }
}
