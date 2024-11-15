package org.example.day23.BasicThreads;

public class MakingThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("별별!!");
        }
    }
}
