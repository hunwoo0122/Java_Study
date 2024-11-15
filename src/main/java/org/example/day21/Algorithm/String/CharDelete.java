package org.example.day21.Algorithm.String;

public class CharDelete {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        Solution s = new Solution();
        String a = s.solution(my_string, letter);
        System.out.println(a);
    }
}

class Solution {
    public String solution(String my_string, String letter) {
        char[] chars = my_string.toCharArray();
        String answer = "";
        return answer;
    }
}