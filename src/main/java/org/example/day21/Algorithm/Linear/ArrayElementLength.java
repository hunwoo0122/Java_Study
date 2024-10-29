package org.example.day21.Algorithm.Linear;

import java.util.Arrays;

public class ArrayElementLength {
    public static void main(String[] args) {
        String[] n = {"We", "are", "the", "world!"};
        Solution3 s = new Solution3();
        int[] a = s.solution(n); //주소, 100번
        System.out.println(Arrays.toString(a));
    }
}

class Solution3 {
    public int[] solution(String[] n) {
        int[] answer = new int[n.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = n[i].length();
        }
        return answer;
    }
}