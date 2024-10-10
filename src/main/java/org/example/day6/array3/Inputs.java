package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inputs {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        JLabel label = new JLabel("먹고 싶은 음식");
        frame.add(label);
        JTextField textField = new JTextField(20);
        frame.add(textField);
        JButton button = new JButton();
        button.setText("어디로 갈까?");
        frame.add(button);
        String[] s = {};
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = textField.getText();
                System.out.println(s);
                if(s.equals("아메리카노")){
                    JOptionPane.showMessageDialog(frame, "카페로 가세요.");
                }else if(s.equals("짜장면")){
                    JOptionPane.showMessageDialog(frame, "중국집으로 가세요.");
                }else if(s.equals("떡볶이")){
                    JOptionPane.showMessageDialog(frame, "분식집으로 가세요.");
                }
            }
        });
        button.setPreferredSize(new Dimension(300,30));
        JLabel label2 = new JLabel("당신의 나이는");
        frame.add(label2);
        JTextField textField2 = new JTextField(20);
        frame.add(textField2);
        JButton button2 = new JButton();
        button2.setText("나의 내년 나이는?");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = textField2.getText();
                int temp = Integer.parseInt(s);
                System.out.println(s);
                JOptionPane.showMessageDialog(frame, "당신의 내년에 " + (temp+1) +"살이 됩니다." );
            }
        });
        frame.add(button2);
        button2.setPreferredSize(new Dimension(300,30));
        JLabel label3 = new JLabel("국어 점수      ");
        frame.add(label3);
        JTextField textField3 = new JTextField(20);
        frame.add(textField3);
        JLabel label4 = new JLabel("수학 점수      ");
        frame.add(label4);
        JTextField textField4 = new JTextField(20);
        frame.add(textField4);
        JButton button3 = new JButton();
        button3.setText("두 과목 점수의 평균은?");
        button3.setPreferredSize(new Dimension(300,30));
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = textField3.getText();
                String s2 = textField4.getText();
                double temp = Double.parseDouble(s);
                double temp2 = Double.parseDouble(s2);
                double avg = (temp+temp2)/2;
                JOptionPane.showMessageDialog(frame, "평균 점수는 " + avg +"입니다.");
            }
        });
        frame.add(button3);
        frame.getContentPane().setBackground(Color.PINK);

        frame.setVisible(true);
    }

}
