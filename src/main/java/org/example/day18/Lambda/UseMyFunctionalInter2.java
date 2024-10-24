package org.example.day18.Lambda;

//1. 이름없는 클래스로 구현해서 사용하는 방법
public class UseMyFunctionalInter2 {
    public static void main(String[] args) {
        MyFunctionalInterface my = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("2번 이름없는 클래스로 구현함.");
            } //메서드
        }; //익명클래스

        my.myMethod();
    }//main
}//class