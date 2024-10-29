package org.example.day21.Algorithm.String;

import java.util.Arrays;

public class StringReverseSort {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        //대 --> 소
        //소문자는 z~~a
        //소문자앞 + 대문자뒤
        //오름차순정렬 후 뒤집기
        char[] c = s.toCharArray();
        Arrays.sort(c); //오름차순으로 정렬!
        //1. 컬렉션으로 만들어서 뒤집기
        //2. sb로 넣어서 뒤집어도 됨.
        StringBuilder sb = new StringBuilder(new String(c));
        String result = sb.reverse().toString();
        System.out.println(result);
        // 실무코드
    }
}
