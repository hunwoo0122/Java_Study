package org.example.day18.DesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("어떤 객체를 생성하시겠습니까? (A, B):");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Object obj = factory.createObject(userInput);
            if (obj == null) {
                System.out.println("유효하지 않은 입력입니다. 다시 시도해주세요.");
            }else {
                System.out.println(userInput + "가(이) 입력되었습니다.\n");
            }
        }
    }
}
