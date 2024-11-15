package org.example.day22.Solution;

import java.util.Arrays;

public class K_orderNum {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] array2 = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        Solution6 s = new Solution6();
        int[] a = s.solution(array, array2);
        System.out.println(Arrays.toString(a));
    }
}

class Solution6 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] subArray = Arrays.copyOfRange(array, start, end);

            Arrays.sort(subArray);
            answer[i] = subArray[k];
        }
        return answer;

    }
}