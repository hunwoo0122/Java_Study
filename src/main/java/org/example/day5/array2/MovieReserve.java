package org.example.day5.array2;

import java.util.Scanner;

public class MovieReserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while(true){
            System.out.println("--------------------------------------");
            System.out.println("1   2   3   4   5   6   7   8   9   10");
            System.out.println("--------------------------------------");
            System.out.println(seat[0]+"   "+seat[1]+"   "+seat[2]+"   "
                    +seat[3]+"   "+seat[4]+"   "+seat[5]+"   "+seat[6]+"   "
                    +seat[7]+"   "+seat[8]+"   "+seat[9]+"   ");
            System.out.println("예매할 좌석 번호를 입력(종료 0번>>>) ");
            int num = sc.nextInt();
            cnt++;
            seat[num-1]++;
            if(num == 0){
                System.out.println("예매 시스템을 종료합니다.");
                break;
            }//if문

        }//while문
        System.out.println("당신의 총 예매수는 " + cnt + "매");
        System.out.println("당신의 총 금액은 " + (cnt * 10000) +"원");
        sc.close();
    }
}
