package org.example.day21.Algorithm.Linear;

import java.util.Arrays;

public class IceAmericano {
    public static void main(String[] args) { //10000
        int money = 5500;
        Solution s = new Solution();
        int[] a = s.solution(money);
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public int[] solution(int money) { //10000
        int[] answer = new int[2]; //{0, 0}
        //잔수 계산, answer[0] : 돈 / 한잔가격
        //잔돈 계산, answer[1] : 돈 /
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
