package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class ComponentUse2 {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // 주소
        f.setSize(500, 500);
        f.setTitle("부품사용연습");
        JButton button = new JButton();
        button.setText("Button");
        button.setBackground(Color.BLUE);
        f.add(button);
        f.setVisible(true);
    }
}
