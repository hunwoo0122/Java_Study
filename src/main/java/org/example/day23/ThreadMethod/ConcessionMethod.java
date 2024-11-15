package org.example.day23.ThreadMethod;

class MyThread2 extends Thread {
    private String name;
    private int startNumber;

    public MyThread2(String name, int startNumber) {
        this.name = name;
        this.startNumber = startNumber;
    }
    public void run() {
        for (int i = startNumber; i <= 10; i++){
            System.out.println(name + ": " + i);
            //CPU 양보 요청
            Thread.yield();
        }
    }
}

public class ConcessionMethod {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("짝수", 0);
        MyThread2 t2 = new MyThread2("홀수", 1);

        t1.start();
        t2.start();
    }
}
