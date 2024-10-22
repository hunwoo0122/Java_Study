package org.example.day13.Thread;

import java.util.TimerTask;

public class Timerwork extends TimerTask {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("tasktasktask=============");
        }
        System.out.println("게임이 종료되었습니다.");
    }
}
