package org.example.day23.BasicThreads;

public class ThreadMainLambdaDirection {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <100; i++) {
                System.out.println("==> 나는 별!!!");
            }
            });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("==> 나는 유로!!!");
            }
        });
        // 실무에서 람다와 이 추상클래스로 인한 메서드와
        // 스레드 인터페이스 메서드로 구현하기도 한다. 스레드로 람다로 구현하기도 한다.
        t1.start();
        t2.start();
    }
}
