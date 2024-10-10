package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SongRank {
    static int count;
    static int count2;
    static int count3;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        JLabel label = new JLabel("Select your favorite song:");
        frame.getContentPane().setBackground(Color.gray);
        frame.add(label);
        Font font = new Font("Serif", Font.BOLD, 20);
        label.setFont(font);
        JButton button = new JButton("아이유 - LILAC");
        button.setPreferredSize(new Dimension(300,50));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                JOptionPane.showMessageDialog(frame, "You voted for 아이유 - LILAC" );
            }
        });

        frame.add(button);
        JButton button2 = new JButton("프로미스나인 - We Go");
        button2.setPreferredSize(new Dimension(300,50));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count2++;
                JOptionPane.showMessageDialog(frame, "You voted for 프로미스나인 - We Go" );
            }
        });
        frame.add(button2);
        JButton button3 = new JButton("스테이씨 - ASAP");
        button3.setPreferredSize(new Dimension(300,50));
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count3++;
                JOptionPane.showMessageDialog(frame, "You voted for 스테이씨-ASAP" );
            }
        });
        frame.add(button3);
        JButton button4 = new JButton("종료");
        button4.setPreferredSize(new Dimension(300,50));
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "아이유: "+ count +"표 \n프로미스나인: " + count2 +"표 \n스테이씨: " + count3 +"표");
            }
        });
        frame.add(button4);
        frame.setVisible(true);
    }
}
