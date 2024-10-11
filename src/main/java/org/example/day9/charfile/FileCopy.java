package org.example.day9.charfile;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        //파일 복사
        //c:/data/공부.txt를
        //c:/data/공부2.txt로 복사
        String originalFileName = "c:/data/공부.txt";
        String targetFileName = "c:/data/공부2.txt";

        try (InputStream is = new FileInputStream(originalFileName);
             OutputStream os = new FileOutputStream(targetFileName)) {

            byte[] data = new byte[1024];
            int num;
            while ((num = is.read(data)) != -1) {
                os.write(data, 0, num);
            }
            os.flush();
            System.out.println("복사가 잘 되었습니다.");

        } catch (IOException e) {
            System.out.println("파일 복사 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
