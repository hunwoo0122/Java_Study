package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3번 환영합니다. 출력
        int i = 0;
        while(true) {
            i++;
            if(i>3){
                break;
            }
            System.out.println("환영합니다.");
        }
        int j = 100;
        for(int k = 1; k <= 101; k++){
            System.out.println(j);
            j ++;
        }
        // 숫자를 100부터 200까지 출력

        Random r = new Random(100);

        for(int k = 0; k < 5; k++){
            int num = r.nextInt(100); //+-21억 ==> 0 ~ 99
            System.out.println(num);
        }

        // Random한 정수값 5개 출력(범위는 0~99)
    }
}
