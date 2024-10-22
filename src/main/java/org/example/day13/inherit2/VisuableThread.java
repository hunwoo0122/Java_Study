package org.example.day13.inherit2;

import javax.swing.*;
import java.util.Date;

public class VisuableThread extends Thread {
    private JLabel day;
    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public void run(){
        for (int i = 0; i < 3000; i++) {
            System.out.println("시각 >> " + new Date());
            day.setText("시각 >> " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
