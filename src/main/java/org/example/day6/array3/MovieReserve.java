package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieReserve {
    static int seatCount = 0; //예매수 누적용
    static int seatPrice = 10000; //좌석번호 누적용
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow); // add()한 순서대로 물흐르듯이 뒤에다 붙여줌.!

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //버튼클릭했을 때 실행되는 내용!
                    //버튼클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand();
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    button.setEnabled(false);
                    button.setBackground(Color.RED);

                    seatCount++;
                }
            });
        }
        JButton button2 = new JButton();
        button2.setText("결제하기");
        button2.setBackground(Color.YELLOW);
        frame.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int totalPrice = seatCount * seatPrice;
                JOptionPane.showMessageDialog(frame,"총 " + seatCount + "개의 좌석이 예매되었습니다. 총 결제 금액: "
                + totalPrice + "원.");
            }
        });
        //맨 끝!
        frame.setVisible(true);
    }
}
