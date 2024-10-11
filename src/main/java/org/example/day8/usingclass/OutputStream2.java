package org.example.day8.usingclass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:\\data\\imsi.txt");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
