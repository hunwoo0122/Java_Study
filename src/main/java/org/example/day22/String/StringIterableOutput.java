package org.example.day22.String;

public class StringIterableOutput {
    public static void main(String[] args) {
        String my_string = "hello";
        Solution2 s = new Solution2();
        String a = s.solution(my_string, 3);
        System.out.println(a);
    }
}

class Solution2 {
    public String solution(String my_string, int n) {
        char[] c = my_string.toCharArray();
        String answer = "";
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < n; j++){
                answer += c[i];
            }
        }
        return answer;
    }
}