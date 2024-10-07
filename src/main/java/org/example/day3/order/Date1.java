package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할 때 자동으로 년월일, 시분초로 구해주고 싶다.
        // 자바 내장함수는 외울 필요 없다.
        Date date = new Date();
        int year = date.getYear() + 1900; // 년
        int month = date.getMonth() + 1; // 월
        int date1 = date.getDate(); // 일
        int day = date.getDay();  // 요일
        int hour = date.getHours(); // 시
        int minute = date.getMinutes(); // 분
        int second = date.getSeconds(); // 초

        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        //오늘 무슨 요일인가요? 프린트
        System.out.println("오늘 무슨 요일인가요?");
        if (day == 5) {
            System.out.println("오늘은 금요일 입니다.");
        }else {
            System.out.println("오늘은 금요일이 아닙니다.");
        }
    }
}