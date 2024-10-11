package org.example.day9.charfile;

import java.io.*;
// 버퍼를 사용한 스트림
public class BufferUsingGoodnano {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/공부.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new BufferedReader(new FileInputStream("c:/data/공부.txt")));
            long start = System.nanoTime();
            while (true){
                String line = bf.readLine();
                if(line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
