package org.example.day8.makingclass;

public class Calculater {
    //필드 x
    //함수명(파라메터,....)
    //파라메터 --> 매개변수
    //사용하는 곳과 실제 처리하는 곳에
    //중간 다리 역할의 변수라고 해서
    //매개변수라고 함.
    //인자, 파라메터, 매개변수 <--> 인수(데이터, argument)
    public int plus(int x, int y) {
        System.out.println("더하기 기능 처리 내용");
        System.out.println(x + y);
        return x + y;
    }

    public int minus(int x, int y) {
        System.out.println("빼기 기능 처리 내용");
        System.out.println(x - y);
        return x - y;
    }

    public void multiply(int x, int y) {
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(x * y);
    }

    public void divide(int x, int y) {
        System.out.println("나누기 기능 처리 내용");
        System.out.println(x / y);
    }
}
