package org.example.day23.BasicThreads;

public class ThreadMain2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MakingThread()); // 클래스 오버라이드하기
        Thread t2 = new Thread(new MakingThread2());

        t1.start();
        t2.start();
    }
}
