package org.example.day2.control;

import java.util.Scanner;

public class InputPractice3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나의 이름은? ");
        String name = sc.next();
        System.out.print("나의 키는? ");
        double height = sc.nextDouble();
        System.out.print("나의 몸무게는? ");
        double weight = sc.nextDouble();
        System.out.print("나는 저녁을 먹었나요? ");
        boolean dinner = sc.nextBoolean();
        System.out.print("나의 좌우명은? ");
        sc.nextLine();
        String behavior = sc.nextLine();

        System.out.println("내 이름은 " + name + "입니다.");
        System.out.println("내 내년 키는 " + height + "입니다.");
        System.out.println("내 내년 몸무게는 "+ weight +"입니다.");
        System.out.println("나는 저녁을 " + dinner +"했습니다.");
        System.out.println("나의 좌우명은 " + behavior +"입니다.");
    }
}
