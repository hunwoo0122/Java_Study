package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
        int num = 10;
        double height = 180.3;
        boolean married = true;
        char gender = '남';
        String fall = "가을이다";
        final String COMPANY = "메가더조은";
        System.out.println("지금 계절은 " + fall);
        System.out.println("결혼여부는 " + married);
        System.out.println("키의 상태는 " + height);
        System.out.println("숫자는 " + num);
        System.out.println("성별은 " + gender);
        System.out.println(COMPANY);

        int month = 9;
        double tempThis = 21.1; // 낙타표기법, package, class, var 다 낙타표기법 표시
        final char COLOR = 'b'; // 바꿀수없음
        boolean rain = false;

        System.out.println("달은 " + month);
        System.out.println("온도는 " + tempThis);
        System.out.println("색은 " + COLOR);
        System.out.println("비가 오나 " + rain);

        int nowTime = 0;
        //변수는 반드시 초기화를 시켜줘야함.
        nowTime = 30;
        System.out.println(nowTime);
    }
}
