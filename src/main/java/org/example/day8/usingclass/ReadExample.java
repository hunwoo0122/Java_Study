package org.example.day8.usingclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/imsi.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
