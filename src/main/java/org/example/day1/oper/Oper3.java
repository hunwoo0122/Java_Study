package org.example.day1.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        //정수1 입력 --> a변수 저장, 333
        //정수2 입력 --> b변수 저장, 222
        String a = JOptionPane.showInputDialog("정수1을 입력하시오");
        String b = JOptionPane.showInputDialog("정수2를 입력하시오");

        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        double result = (double) (a2 + b2) / 2; // 자바는 하나가 실수이면 나머지 피연산자는 저절로 실수가 된다.

        System.out.println(result);
        //입력을 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
        //두 입력값의 평균을 구하시오.(실수로)
        JOptionPane.showMessageDialog(null, result);
    }
}
