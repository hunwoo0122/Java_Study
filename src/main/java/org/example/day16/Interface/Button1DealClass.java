package org.example.day16.Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListener는 버튼 클릭했을 때 처리 표준으로 만들어놓음.!
public class Button1DealClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("b1클릭함.");
    }
}
