package org.example.day13.except;

public class ExceptMain2 {
    public static void main(String[] args) {
        ErrorClass2 error = new ErrorClass2();
        try {
            error.call(); //에러가 있는 메서드를 호출함.
        } catch (Exception e) {
            System.out.println("부르는 곳에서 예외처리함.");
        }
        System.out.println("에러발생후 실행될까요..!!!!!");
        System.out.println("에러발생후 실행될까요..!!!!!");
        System.out.println("에러발생후 실행될까요..!!!!!");
        System.out.println("에러발생후 실행될까요..!!!!!");
    }
}
