package org.example.day23.ThreadMethod;

class Counter1 {
    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }
    public int getCount() {
        return count;
    }
}

public class JoinMain {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.join();
        t2.join();

        t1.start();
        t2.start();

        // 메인 스레드에서 count 값을 출력(join() 메서드 필요)
        System.out.println("Final count: " + counter.getCount());
    }
}
