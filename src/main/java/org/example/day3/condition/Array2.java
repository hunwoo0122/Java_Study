package org.example.day3.condition;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 배열에 넣어보자.
        //5명, 이름, 나이, 키, 성별, 아침밥여부
        String[] names = {"홍길동", "김길동", "박길동", "정길동", "이길동"};
        //System.out.println(names[0]);
        //System.out.println(names[1]);
        //System.out.println(names[2]);
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        //for-each
        for(String s : names){
            System.out.println(s);
        }
        System.out.println();

        System.out.println(names.length);
        int[] age = {50, 40, 30, 20, 10};
        for (int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }
        for (int x : age){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(age)); // 배열안에 무엇이 들어있는 지 확인할때 쓰는 코드
        double[] height = {180.7, 175.5, 176.6, 167.9, 170.0};
        for (double y : height){
            System.out.println(y);
        }
        char[] gender = {'g', 'b', 'g', 'b', 'g'};
        for (char g : gender){
            System.out.println(g);
        }
        boolean[] breakfast = {true, true, true, true, true, true};
        for (boolean b : breakfast){
            System.out.println(b);
        }
        System.out.println(Arrays.toString(breakfast));
        System.out.println(names[names.length-1]);
    }
}
