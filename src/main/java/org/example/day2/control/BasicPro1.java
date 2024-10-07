package org.example.day2.control;

import java.util.Scanner;

public class BasicPro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("여행 지역을 입력하세요: ");
        String travel = sc.next();
        System.out.print("1인당 경비를 입력하세요: ");
        int cost = sc.nextInt();
        System.out.print("여행 인원을 입력하세요: ");
        int people = sc.nextInt();
        System.out.print("할인율(%)를 입력하세요: ");
        double sale = sc.nextDouble();
        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean vip = sc.nextBoolean();
        System.out.print("당부의 말을 입력하세요: ");
        sc.nextLine();
        String talk = sc.nextLine();

        double plussale;
        if (vip == true) {
            plussale = sale + 5;
        }else{
            plussale = sale;
        }

        System.out.println();
        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + travel);
        System.out.println("1인당 경비: " + cost + "원");
        System.out.println("여행 인원: " + people + "명");
        System.out.println("기본 할인율: " + sale + "%");
        if(vip == true){
            System.out.println("VIP 추가 할인율: 5%");
            System.out.println("최종 할인율: " + plussale +"%");
        }
        System.out.println("총 경비: " + cost*people + "원");
        if(vip == true){
            System.out.println("할인 금액: " + ((cost*people)*(plussale/100))+"원");
            System.out.println("할인 후 총 경비: " + (cost*people - cost*people*(plussale/100)) +"원");
        }else{
            System.out.println("할인 금액: " + (cost*people)*(sale/100) +"원");
            System.out.println("할인 후 총 경비: " + (cost*people - cost*people*(sale/100)) +"원");
        }

        System.out.println("당부의 말: " + talk);

        sc.close();
    }
}
