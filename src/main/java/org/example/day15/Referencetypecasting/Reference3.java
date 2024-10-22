package org.example.day15.Referencetypecasting;

import javax.swing.*;
import java.util.ArrayList;

public class Reference3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JFrame f2 = new JFrame();
        JButton b1 = new JButton();
        JLabel l1 = new JLabel();
        JTextField t1 = new JTextField();
        JTextArea t2 = new JTextArea();
        ArrayList list = new ArrayList();

        f.add(b1); //자동형변환! Component(부모, 큰) <-- JButton(자식, 작)
        f.add(l1);
        f.add(t1);
        f.add(t2); //컴포넌트에 자식들 집어넣음
        f.add(f2);
        //f.add(list); //큰/작은 관계가 성립X(상속관계X)
        //==> 참조형형변환은 상속관계일때만 가능하다.!

    }
}
