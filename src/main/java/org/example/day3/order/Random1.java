package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random(100); // 아무값을 만들어주는 클래스
        // r.setSeed(100); // 시드값, 씨앗값 시드값을 써야 랜덤값들이 균등하게 분포됨
        //의사 임시값!
        // 반복문을 만들때는 유한반복, 무한반복
        for(int i = 0; i < 10; i++) {
            int num = r.nextInt(100); //+-21억 ==> 0 ~ 99
            int num2 = r.nextInt(100) + 1; //==> 1~100
            System.out.println(num);
            System.out.println(num2);
        }
    }
}