package org.example.day13.except;

public class ErrorClass {
    public void call(){
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("내가 예외처리함.");
        }
    }
}
