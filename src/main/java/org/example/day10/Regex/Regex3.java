package org.example.day10.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //우리 회사 직원 정보를 입력을 받아보자.!!
        System.out.println("이름입력>> "); //한글입력, 3-4글자이어야 함.
                                         // 제대로 입력했으면 "이름님 환영합니다" 출력
                                         // 아니면 "다시 입력해야합니다."출력;
        String name = sc.next();
        boolean result1 = Pattern.matches("^[가-힣]{3,4}$", name); // 모든글자와 3글자 아니면 4글자
        if (result1) {
            System.out.println(name +"님 환영합니다.");
        }else {
            System.out.println("다시 입력해야합니다.");
            //name = sc.next();
        }
        System.out.println("나이입력>> "); //숫자만으로 이루어졌는지 확인!
                                         //숫자만으로 이루어졌으면 Integer.parseInt()로
                                         //숫자로 변환 후, 만으로 계산(-1)후 나이 출력
        String age = sc.next(); //100
        boolean result2 = Pattern.matches("^[0-9]+$", age);
        if (result2) {
            int age2 = Integer.parseInt(age);
            System.out.println("만 나이는: " + (age2 - 1));
        }else {
            System.out.println("숫자만 입력해야합니다.!!");
        }
        System.out.print("이메일(com)입력>> ");//영문+숫자+_(언더바, 밑줄)포함한 5-8글자
                                         //new.com을 포함하고 있어야 함.
                                         //유효하면 "이메일이 유효합니다." 출력
                                         //유효하지 않으면 "이메일이 유효하지 않습니다." 출력
        String email = sc.next();
        boolean result3 = Pattern.matches("^[a-zA-Z0-9_]{5,8}@new\\.com$", email);
        //^[a-zA-Z0-9_] ==> \\w
        if (result3) {
            System.out.println("이메일이 유효합니다.");
        }else{
            System.out.println("이메일이 유효하지 않습니다.");
        }
        sc.close();
    }
}
