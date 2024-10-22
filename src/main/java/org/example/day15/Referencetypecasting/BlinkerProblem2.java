package org.example.day15.Referencetypecasting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkerProblem2 {
    static JFrame f;
    public static void main(String[] args) {
        f = new JFrame("나의 신호등");
        f.setSize(600, 700);
        f.getContentPane().setBackground(Color.green);
        //JFrame에는 배경색설정 기능이 없고,
        // ContentPane을 가지고 와서 여기서 배경색 설정!
        //FlowLayout생성
        FlowLayout flow = new FlowLayout();
        //버튼 3개 만들기
        JButton red = new JButton("빨강신호");
        JButton yellow = new JButton("노랑신호");
        JButton blue = new JButton("파랑신호");
        red.setBackground(Color.red);
        yellow.setBackground(Color.yellow);
        blue.setBackground(Color.blue);

        //프레임에 레이아웃 설정
        f.setLayout(flow);
        //프레임에 버튼 3개 추가
        f.add(red);
        f.add(yellow);
        f.add(blue);

        Font font = new Font("궁서", Font.BOLD, 35);
        red.setFont(font);
        yellow.setFont(font);
        blue.setFont(font);


        red.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                show("r.png");
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show("y.png");
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show("g.png");
            }
        });
        //맨 끝!
        f.setVisible(true);
    }

    public static void show(String filename) {
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(filename);
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
