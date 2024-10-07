package org.example.day2.control;

import java.util.Scanner;

public class InputPractice2 {
    public static void main (String[] args) {
        // 수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("첫 번째 숫자 (" + num1 + ")가 두 번째 숫자 (" + num2 + ")보다 큽니다.");
        } else if (num1 < num2) {
            System.out.println("첫 번째 숫자 (" + num1 + ")가 두 번째 숫자 (" + num2 + ")보다 작습니다.");
        } else {
            System.out.println("첫 번째 숫자 (" + num1 + ")와 두 번째 숫자 (" + num2 + ")는 같습니다.");
        }

        // 정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        sc.close();
    }
}
