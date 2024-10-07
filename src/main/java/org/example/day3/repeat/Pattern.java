package org.example.day3.repeat;

import javax.swing.*;

public class Pattern {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 1000; i++){
            sum = sum + i; //sum += i;
        }
        // 문자열 누적
        String sum2 = ""; // 문자열 누적변수일때만 ""로 감싸주고 나머지 데이터타입형은 null
        for (int i = 0; i < 3; i++) {
            String data = JOptionPane.showInputDialog("과목 입력");
            sum2 = sum2 + data; //sum2 += data;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
