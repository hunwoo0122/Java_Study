package org.example.day9.charfile;
import java.io.*;

public class ByteChar {
    public static void main(String[] args) {
        //파일에 쓰기(String --> byte변환 저장)
        try {
            OutputStream os = new FileOutputStream("c:/data/test.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!!!");
            writer.flush();
            writer.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();  // 자세히 에러정보를 프린트!
        }

        //파일 읽어오기(byte단위 전송됨.)
        try {
            InputStream is = new FileInputStream("c:/data/test.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");  // 인코딩 명시
            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data, 0, num);
            System.out.println(str);
            reader.close();  // 스트림 닫기
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
