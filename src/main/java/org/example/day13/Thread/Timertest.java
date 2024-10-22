package org.example.day13.Thread;

import java.util.Timer;

public class Timertest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Timerwork work = new Timerwork();
        System.out.println("5초동안 게임을 할 수 있습니다.");
        timer.schedule(work, 5000);
        System.out.println("5초가 count되는 중입니다..");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ">> mainmainmain=======");
        }
    }
}
