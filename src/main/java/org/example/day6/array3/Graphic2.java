package org.example.day6.array3;

import javax.swing.*;

public class Graphic2 {
    public static void main(String[] args) {
        //하나하고 확인
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Graphic Practice");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setText("Click Me");
        frame.add(button);
        frame.setVisible(true);
    }
}
