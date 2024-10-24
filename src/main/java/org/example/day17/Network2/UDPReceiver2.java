package org.example.day17.Network2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver2 {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(8888); // 포트 8888에서 수신 대기
            System.out.println("UDPReceiver: 받는 쪽 소켓 시작, 받을 준비 끝");

            while (true) {
                byte[] buffer = new byte[256]; // 수신할 데이터를 저장할 버퍼
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet); // 데이터 수신

                String receivedData = new String(packet.getData(), 0, packet.getLength()); // 받은 데이터 문자열로 변환
                System.out.println("UDPReceiver: 받은 데이터: " + receivedData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close(); // 소켓 닫기
            }
        }
    }
}
