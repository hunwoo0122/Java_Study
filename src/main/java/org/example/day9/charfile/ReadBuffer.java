package org.example.day9.charfile;

import java.io.*;

// 3. start1프로젝트 아래 gradle파일을 버퍼에 넣어 한 줄씩 읽어와서 프린트하고 nanoTime()으로
//처리 시간 계산하여 출력
public class ReadBuffer {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/new_java/start1/build.gradle");
            Reader os = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(os);
            while (true){
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            bf.close();
            os.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
