package org.example.day8.usingclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream1 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/data/imsi.txt");

            while (true) {
                int data = is.read();  // 1 byte씩 읽기
                System.out.println(data);
                if (data == -1) break;  // 파일 끝에 도달했을 경우
                //System.out.println(data);
            }

            is.close();  // 입력 스트림을 닫고 사용 메모리 해제
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
