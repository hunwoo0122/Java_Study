package org.example.day13.inherit2;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {
    JLabel count, image, day; // 전역변수, 아무데서나 접근 가능.
    volatile boolean running = true; // 스레드 중지 플래그

    public ThreadGraphic() {
        setSize(700, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); // add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 80);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        // Jframe에 끼워넣음.
        add(count);
        add(image);
        add(day);

        카운터스레드2 c = new 카운터스레드2();
        c.start();
        배열스레드2 a = new 배열스레드2();
        a.start();
        시각스레드2 t = new 시각스레드2();
        t.start();

        // 맨끝!
        setVisible(true);
    } // 생성자

    public class 시각스레드2 extends Thread {
        public void run() {
            while (running) {  // running 플래그가 true일 때만 실행
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } // 시각스레드2 클래스

    public class 카운터스레드2 extends Thread {
        public void run() {
            for (int i = 500; i > 0; i--) {
                if (i == 500) {
                    Toolkit.getDefaultToolkit().beep();
                }
                System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i);
                if (i == 1) {
                    JOptionPane.showMessageDialog(count, "이제 나갈시간입니다.");
                    running = false;  // 다른 스레드를 중지시키기 위해 플래그 변경
                }
                try {
                    Thread.sleep(500); // 1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } // 카운터스레드2

    public class 배열스레드2 extends Thread {
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        public void run() {
            int i = 0;
            while (running && i < foods.length) { // running 플래그가 true일 때만 실행
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                i++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }
}