package org.example.day22.Solution;

public class FindNum3 {
    public static void main(String[] args) {
        int a = 232443;
        Solution s = new Solution();
        int answer = s.solution(a, 4);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int num, int k) {
        String num_str = Integer.toString(num);
        String[] array = num_str.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(Integer.toString(k))) {
                return i+1;
            }
        }
        return -1;
    }
}