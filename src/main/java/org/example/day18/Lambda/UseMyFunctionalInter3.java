package org.example.day18.Lambda;

//3. 람다식(람다함수, 익명함수)으로 바로 구현해서 사용하는 방법
public class UseMyFunctionalInter3 {
    public static void main(String[] args) {
        MyFunctionalInterface my = () -> System.out.println("3. 람다식으로 구현함.");

        my.myMethod();
    }//main
}//class