package org.example.day2.control;

import javax.swing.*;

public class Order2 {
    public static void main(String[] args) {
        String answer = "맑음";

        //날씨가 어때? 입력!
        String wheather = null;
        wheather = JOptionPane.showInputDialog("날씨가 어때?");

        System.out.println(answer.equals(wheather));
        //맑음과 같으면, 정답!!이라고 출력!
        double temp = 21.2; // 온도
        double humid = 55.5; // 습도
        //현재 온도가 20도 보다 높고 습도가 70보다 높은지 출력!
        //Double.parseDouble()이용
        String temp2 = null;
        String humid2 = null;
        temp2 = JOptionPane.showInputDialog("온도 입력: ");
        humid2 = JOptionPane.showInputDialog("습도 입력: ");

        /*
        String temp2 = JOptionPane.showInputDialog("온도 입력: ");
        String humid2 = JOptionPane.showInputDialog("습도 입력: "); 로 해도 됨
         */
        double temp3 = Double.parseDouble(temp2); // 변수가 회색으로뜨면 쓸데없는 공간을 만든것 공간낭비
        // 램에 넣고 쓰지를 않음
        double humid3 = Double.parseDouble(humid2);

        System.out.println(temp3 < temp3 && humid < humid3);
        JOptionPane.showMessageDialog(null, temp < temp3 && humid < humid3);
        // 코드 포맷팅 컨트롤 + 알트 + L

        double d = 123.5659959683838293;
        System.out.println((int)d);
        System.out.printf("%.2f", d);
    }
}