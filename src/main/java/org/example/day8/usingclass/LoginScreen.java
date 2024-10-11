package org.example.day8.usingclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel 3개, JTextField 2개, JButton 2개
        JLabel top = new JLabel();
        top.setText("일기장");
        Font font = new Font("궁서", Font.BOLD, 90);
        top.setFont(font);
        JLabel id = new JLabel();
        Font font2 = new Font("궁서", Font.BOLD,30);
        id.setText("ID");
        JLabel pw = new JLabel();
        pw.setText("PW");

        //입력하는 객체
        JTextField id2 = new JTextField(10);
        JTextField pw2 = new JTextField(10);

        JButton ok = new JButton();
        ok.setText("OK");
        JButton del = new JButton();
        del.setText("Del");
        ok.setFont(font2);
        del.setFont(font2);
        //이미지를 넣을 때는 이미지아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");
        ok.setIcon(icon);
        del.setIcon(icon2);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        id2.setBackground(Color.yellow);
        pw2.setBackground(Color.yellow);
        id2.setForeground(Color.blue);
        pw2.setForeground(Color.blue);
        ok.setBackground(Color.green);
        del.setBackground(Color.green);

        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(del);

        //ok버튼 - 아이디와 패스워드가 root, 1234가 맞는지 체크 처리
        //del버튼 - 입력한 값 지우기 처리

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //ok버튼을 클릭했을 때 처리하는 내용을 넣으세요.
                String id3 = id2.getText();//id2에 입력한 값을 가지고 와주는
                String pw3 = pw2.getText();
                if(id3.length() > 0 && pw3.length() > 0) {
                    if(id3.equals("root") && pw3.equals("1234")) {
                        JOptionPane.showMessageDialog(frame,"로그인에 성공하였습니다!");
                        //일기쓰기 화면이 보이게 하자.
                        DiaryScreen diary = new DiaryScreen();
                        diary.open();
                    }else{
                        JOptionPane.showMessageDialog(frame, "로그인에 실패하였습니다.");
                    }
                }else{
                    JOptionPane.showMessageDialog(frame, "id와 pw를 입력해주세요.");
                }
                int temp = id3.length();
                int temp2 = pw3.length();

                System.out.println(temp + " " + temp2);
                //id3가 root이고, pw3이 1234와 같으면,
                //로그인 성공! 알려주세요.!
                //아니면 로그인 실패!
            }
        });
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");
            }
        });
        //맨 끝!
        frame.setVisible(true);
    }
}
