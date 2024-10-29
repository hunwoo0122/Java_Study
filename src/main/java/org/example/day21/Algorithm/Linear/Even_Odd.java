package org.example.day21.Algorithm.Linear;

import java.util.Arrays;

public class Even_Odd {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        Solution2 s = new Solution2();
        int[] a = s.solution(num_list);
        System.out.println(Arrays.toString(a));
    }
}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //{0,0}
        //잔수 계산, answer[0] : 돈 / 한잔가격
        //잔돈 계산. answer[1] : 돈 % 한잔가격
        for (int x : num_list){
            if (x % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}