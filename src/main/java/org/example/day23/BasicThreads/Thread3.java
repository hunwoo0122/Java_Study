package org.example.day23.BasicThreads;

public class Thread3 extends Thread {
    //start() --> 동시에 실행할 목록으로 이 스레드도 넣음
    //run() --> 동시에 실행해주는 내용!!

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread3 : " + i);
            System.out.println("*");
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println("스레드 재우기에 문제 발생함.");
            }
        }
    }
}
