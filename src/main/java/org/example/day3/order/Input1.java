package org.example.day3.order;

import java.util.Scanner;

public class Input1 { //class는 부품이름 public은 아무데나 쓸수 있음
    public static void main(String[] args) {
        //입력
        //ram에 있어야함.
        //int x = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력>> "); //println(), printf()
        int age = sc.nextInt(); // 모든 입력은 타입을 컴퓨터는 String으로 인식-> int로 변경
        System.out.print("아침을 먹었는지 입력(true/false)?");
        boolean result = sc.nextBoolean();
        //처리 ==> cpu
        int nextAge = age + 1;
        String text = null; // Strgin text;는 안됨 문제가 많은 코드,주소가 없음.(널), 기본형이 아닌 데이터는 null로 초기화,
        if(result == true){
            text = "점심을 조금 먹어도 되겠네요.!"; // String 타입형 선언이 안되는이유는 같은이름으로 선언이 안되기 때문
            // 램에 변수를 저장해서 공간을 차지했는데 또 똑같은 변수를 선언하면 램이 낭비되기 때문
        }else{
            text = "점심을 많이 먹어야 되겠네요.!";
        }

        //출력
        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과 " + text);
        // 보통 코드에서 입력,처리,출력이 모두 들어간다.
        //클래스들이 그레이들에서 정리 및 관리
        // 백엔드에는 로그기록이 굉장히 중요하다.
    }
}
