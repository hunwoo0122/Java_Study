package org.example.day5.array2;

import java.util.Scanner;

public class PopularVote {
    public static void main(String[] args) {
        //이름 배열
        String[] name = {"아이유", "유재석", "방탄"};
        //투표수 배열
        int[] tv = new int [3]; //{0,0,,0}
        Scanner sc = new Scanner(System.in); // 자바코드<-연결스트림 오픈->콘솔
        while(true){
            System.out.println("인기투표 1)아이유, 2)유재석, 3)BTS, 4)종료");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();
            // 무한루프 종료시점 명시
            if (num == 1) {
                tv[num-1]++;
                System.out.println("아이유가 한표 획득!");
            }else if(num == 2){
                tv[num-1]++;
                System.out.println("유재석이 한표 획득!");
            }else if(num == 3){
                tv[num-1]++;
                System.out.println("BTS가 한표 획득!");
            }else if(num == 4){
                System.out.println("종료합니다.");
                break;
            }

        }
        int cnt = tv[0] + tv[1] + tv[2];
        System.out.println("아이유: " + tv[0]);
        System.out.println("유재석: " + tv[1]);
        System.out.println("BTS: " + tv[2]);
        System.out.println("전체 투표수: " + cnt);
        sc.close();
        // close를 하는 이유는 이 코드를 안쓰면 서버에 배열수만큼 입력을 전달해서
    }
}
