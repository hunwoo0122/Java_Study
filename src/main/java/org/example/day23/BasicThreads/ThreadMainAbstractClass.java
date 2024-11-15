package org.example.day23.BasicThreads;

public class ThreadMainAbstractClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("달러!!");
                }
            } //run메서드를 구현한 익명 클래스
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("유로!!");
                }
            }
        };

        t1.start();
        t2.start();
    }
}