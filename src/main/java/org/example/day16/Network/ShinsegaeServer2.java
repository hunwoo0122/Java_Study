package org.example.day16.Network;

import java.io.IOException;
import java.net.ServerSocket;

public class ShinsegaeServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        //ip는 컴퓨터 따라감.
        while (true) {
            System.out.println("서버가 돌아가는중.");
            server.accept();
            System.out.println("승인이 떨어짐.");
        }
    }
}
