package org.example.day16.Network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ShinsegaeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        //1.서버가 start
        //ip는 컴퓨터 따라감.
        int count = 0;
        while (true) {
            System.out.println("서버가 돌아가는중.");
            //2. 요청이 들어오면 승인용 서버가 승인을 함.
            //   --> 연결통로(stream)가 만들어진다.(Socket)
            Socket socket = server.accept();
            count++;
            System.out.println("현재까지 " + count + "개 승인이 떨어짐.");
            //3. 보낼 데이터를 정하자.
            //   스트림으로 연결된 데이터를 보낼 수 있는 부품. PrinWriter
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("나는 자바 프로그래머다.!!!");
            out.close();
            socket.close();
        }
    }
}
