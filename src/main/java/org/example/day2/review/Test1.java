package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        //기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp  = 23.5f; // ==> double
        byte date = 26; // -128 ~ 127 ==> int 메모리를 효율적으로 쓰고 싶으면 byte
        final char DAY = '목';  // 자바는 파이썬과 달리 char은 ''로 감싸야하고 String은 "로 감싸야함
        // 앞에 final을 붙이면 변경불가
        boolean food = true;

        String roomNo = "강의장 6호"; //클래스를 만들어서 조립해서 사용하려면 용량이 작아야 한다.

        System.out.println("온도 : " + temp);
        System.out.println("날짜 : " + date);
        System.out.println("요일 : " + DAY);
        System.out.println("음식 제공 여부 : " + food);
        System.out.println("강의장 번호 : " + roomNo);
    }
}