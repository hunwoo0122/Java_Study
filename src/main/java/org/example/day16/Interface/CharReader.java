package org.example.day16.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharReader {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        Font font = new Font("궁서", Font.BOLD, 30);

        JLabel label = new JLabel("문장을 넣으세요.");
        JTextArea area = new JTextArea(7, 10);
        area.setAutoscrolls(true);
        area.setLineWrap(true);
        JButton click = new JButton("Click");
        JButton click2 = new JButton("Pad Color");
        JButton click3 = new JButton("Text Color");

        label.setFont(font);
        area.setFont(font);
        click.setFont(font);
        click2.setFont(font);
        click3.setFont(font);

        f.add(label);
        f.add(area);
        f.add(click);
        f.add(click2);
        f.add(click3);

        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
                area.setText("");
            }
        });
        click2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setBackground(Color.yellow);
            }
        });

        click3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.red);
            }
        });
        f.setVisible(true);
    }
}
