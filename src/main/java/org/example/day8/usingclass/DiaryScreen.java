package org.example.day8.usingclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class DiaryScreen {
    public void open() {
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        JLabel today = new JLabel("오늘의 날짜");
        frame.add(today);
        JTextField today2 = new JTextField(20);
        frame.add(today2);
        JLabel title = new JLabel("오늘의 제목");
        frame.add(title);
        JTextField title2 = new JTextField(20);
        frame.add(title2);
        JLabel content = new JLabel("오늘의 내용");
        frame.add(content);
        JTextField content2 = new JTextField(20);
        frame.add(content2);
        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        frame.add(save);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = today2.getText();
                String s2 = title2.getText();
                String s3 = content2.getText();
                System.out.println("오늘의 날짜: " + s +"\n오늘의 제목: " + s2 + "\n오늘의 내용: " + s3);

                //파일을 만드는 부품
                //가지고 온 데이터를 파일에 저장

                //파일도 만들어주고, 스트림으로 데이터를 저장까지 해주는 기능을 부품!
                try {
                    FileWriter file = new FileWriter(s + ".txt");
                    file.write(s + "\n");
                    file.write(s2 +"\n");
                    file.write(s3 +"\n");
                    file.close();
                }catch(IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }
                //외부에있는 네트워크와 내부에 있는 파일을 연결할때 대비책 필요
                //파일 연결 문제가 생겼을때 파일에 저장하거나 db에 누적시켜서 그에대한 문제를 분석해서 보고서로 만들면 백엔드개발자로서 좋은 퍼포먼스
            }
        });

        //맨끝
        frame.setVisible(true);
    }
}
