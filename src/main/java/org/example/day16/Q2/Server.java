package org.example.day16.Q2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        //1.서버가 start
        //ip는 컴퓨터 따라감.
        int count = 0;
        while (true) {
            Socket socket = server.accept();
            System.out.println(count+"번: 클라이언트가 9000포트 서버에 연결을 요청함.");
            count++;
            System.out.println("서버로 부터 받은 데이터 >> i am a java programmer!!");
            //2.
            socket.close();
        }
    }
}
