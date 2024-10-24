package org.example.day17.Chatting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class GroupTalk extends JFrame {
    Color[] colors = {new Color(0xE9EED9),
            new Color(0xCBD2A4),
            new Color(0x9A7E6F),
            new Color(0x54473F)};


    JTextArea list;
    JTextField input;
    String name;

    ArrayList<String> benned = new ArrayList<>();

    public GroupTalk() throws Exception {
        Font font = new Font("한컴산뜻돋움", Font.BOLD, 20);
        Font font2 = new Font("한컴산뜻돋움", Font.BOLD, 30);


        name = JOptionPane.showInputDialog("이름을 입력해주세요.");
        send_name(1);
        System.out.println("생성자 시작.");
        setTitle("단체톡");
        setSize(500, 500);
        getContentPane().setBackground(Color.yellow);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());

        list = new JTextArea();

        list.setBackground(colors[0]);
        list.setAutoscrolls(true);
        list.setLineWrap(true);
        list.setFont(font);
        list.setEditable(false);

        // JTextArea를 JScrollPane으로 감싸서 스크롤 가능하게 설정
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        input = new JTextField();
        input.setBackground(colors[3]);
        input.setFont(font);
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list.append(name + " : " + input.getText() + "\n");

                DatagramSocket socket = null;
                try {
                    socket = new DatagramSocket();
                    InetAddress[] ip_arr = new InetAddress[70];
                    for (int i = 0; i < 70; i++) {
                        ip_arr[i] = InetAddress.getByName("192.168.60." + i);
                    }

                    String s = name + " : " + input.getText() + "\n";
                    byte[] data = s.getBytes();

                    for (int i = 0; i < 70; i++) {
                        DatagramPacket packet = new DatagramPacket(data, data.length, ip_arr[i], 8888);
                        socket.send(packet);
                    }
                    socket.close();
                    input.setText("");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JButton benBtn = new JButton("채팅차단하기");
        benBtn.setFont(font2);
        benBtn.setBackground(colors[2]);
        add(benBtn, BorderLayout.NORTH);
        benBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String benId = JOptionPane.showInputDialog("차단할 아이디를 알려주세요");
                benned.add(benId);
            }
        });

        add(scrollPane, BorderLayout.CENTER); // JScrollPane을 추가
        add(input, BorderLayout.SOUTH);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                        getContentPane(),
                        "정말 종료하시겠습니까?",
                        "종료 확인",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

                // 사용자가 '예'를 선택하면 프로그램 종료
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        send_name(2);
                        System.exit(0);
                    }catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        setVisible(true);
    }

    public void process() throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);
        while (true) {
            byte[] data = new byte[256];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String text = new String(data).trim();

            boolean isBen = false;
            for(String s : benned) {
                if(text.contains(s)) {
                    isBen = true;
                    break;
                }
            }

            if (!text.contains(name)&&!isBen) {
                list.append(text + "\n");
            }
            list.setCaretPosition(list.getDocument().getLength());
        }
    }
    public void send_name(int choice) throws Exception {
        DatagramSocket socket = null;
        socket = new DatagramSocket();
        InetAddress[] ip_arr = new InetAddress[70];
        for (int i = 0; i < 70; i++) {
            ip_arr[i] = InetAddress.getByName("192.168.60." + i);
        }

        String s=" ";
        if(choice==1){
            s = name + "님이 입장하였습니다.\n";
        }
        if(choice==2){
            s = name + "님이 퇴장하였습니다.\n";
        }
        byte[] data = s.getBytes();

        for (int i = 0; i < 70; i++) {
            DatagramPacket packet = new DatagramPacket(data, data.length, ip_arr[i], 8888);
            socket.send(packet);
        }
        socket.close();

    }

    public static void main(String[] args) throws Exception {
        GroupTalk m = new GroupTalk();
        m.process();
    }
}