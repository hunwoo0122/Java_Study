package org.example.day1.oper;

import javax.swing.*;

public class Oper1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("당신의 이름을 입력하시오.");//"홍길동"
        String age = JOptionPane.showInputDialog("당신의 나이을 입력하시오."); // "100"

        int age2 = Integer.parseInt(age);
        int age3 = age2 + 1;

        /* string age를 int로 바꿔준다. 변수(age2)에 저장을
         안하면 스트링을 정수형으로만 바뀌고 사라진다.*/
        System.out.println(name + " " + age3);
        // age2에 1을 더해서 age3에 넣었다가 프린트
    }
}
