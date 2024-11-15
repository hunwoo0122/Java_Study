package org.example.day22.String;

public class String_Deal_Basic {
    public static void main(String[] args) {
        String a = "a234";
        Solution s = new Solution();
        boolean answer = s.solution(a);
        System.out.println(answer);
    }
}

class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if (len == 4 || len == 6) {
            for (char ch : s.toCharArray()) {
                if (ch < '0' || ch > '9')
                    return false;
            }
            return true;
        }
        return false;
    }
}
