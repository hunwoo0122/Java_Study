package org.example.day8.usingclass;

import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        try{
            java.io.OutputStream os = new FileOutputStream("c:/data/temp.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace(); //자세하게 프린트
        }
    }
}
