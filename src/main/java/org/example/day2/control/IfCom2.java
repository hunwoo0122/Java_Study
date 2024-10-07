package org.example.day2.control;

public class IfCom2 {
    public static void main(String[] args) {
        int hour = 16;
        while (true){
            if (hour < 10) {
                System.out.println("아직 멀었구나.");
            } else if (hour < 14) {
                System.out.println("좀 남았구나");
            }else if (hour < 18){
                System.out.println("조금 남았구나");
            }else{
                System.out.println("집에 가자! 공부 끝!");
                break;
                //System.exit(0) <- 시스템 완전 종료
            } //else
        }//while
        System.out.println("공부 많이 함.");
    }
}
