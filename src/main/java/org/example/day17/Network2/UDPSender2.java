package org.example.day17.Network2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender2 {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            InetAddress receiverAddress = InetAddress.getByName("localhost"); // 수신자 IP

            Scanner scanner = new Scanner(System.in);
            System.out.println("메시지를 입력하세요: ");
            String message = scanner.nextLine(); // 클라이언트에서 보낼 메시지 입력

            byte[] buffer = message.getBytes(); // 메시지를 바이트 배열로 변환
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, 8888); // 수신자 포트는 8888로 설정
            socket.send(packet); // 메시지 전송

            System.out.println("UDP Sender: 클라이언트 포트 >> " + socket.getLocalPort() + " -> 메시지 전송: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close(); // 소켓 닫기
            }
        }
    }
}
