package org.example.day18.DesignPattern;

import java.util.Scanner;

public class UseObjectFactory {
    public static void main(String[] args) {
        ObjectCreateFactory factory = new ObjectCreateFactory();
        factory.getInstance("apple");
        factory.getInstance("banana");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("어떤 객체 생성?");
            String user = sc.next();
            if (user.equalsIgnoreCase("exit")) break;
            Object o = factory.getInstance(user);
            if (o == null)  {
                System.out.println("유효하지 않음 입력을 함.다시 시도!");
            }else{
                System.out.println(user + "가 입력됨!");
            }
        }
        sc.close();
    }
}

