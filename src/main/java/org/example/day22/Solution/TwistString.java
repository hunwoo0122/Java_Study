package org.example.day22.Solution;

public class TwistString {
    public static void main(String[] args) {
        String myString = "bread"; //last index값 d -> a -> e
        //뒤집어서 스트링으로 모으자.!
        //StringBuilder
        //String에서 뒤에서 가지고 와서 sb에 그냥 쌓기만 함.!
        //int last = myString.length() - 1;//4,3,2,1,0
        //StringBuilder sb = new StringBuilder();
        Solution5 s = new Solution5();
        String answer = s.solution(myString);
        //for (int i = last; i >= 0; i--) {
        //    sb.append(myString.charAt(i));
        //}//for
        //System.out.println(sb.toString())
        // ;
        System.out.println(answer);
    }
}

class Solution5 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = my_string.length(); i >= 0; i--) {
            sb.append(my_string.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}