package org.example.day4.array;

import java.util.Random;

public class ToeicCheck {
    public static void main(String[] args) {
        //1. 답안 배열, 내답 배열
        //2. Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        //3. 답안과 내답의 인덱스값을 각각 비교해서 맞으면 1점!
        //4. 총점을 출력해주세요.!
        int[] ans = new int[990];
        int[] my_ans = new int[990];

        Random r = new Random(42);

        for (int i = 0; i < 990; i++) {
            ans[i] = r.nextInt(4) + 1;
            my_ans[i] = r.nextInt(4) + 1;
        }
        System.out.println("번호:\t답안\t내답");
        System.out.println("-----------------------");
        int cnt = 0;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == my_ans[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
