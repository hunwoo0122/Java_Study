package org.example.day9.charfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/산책.txt");
            OutputStream os = new FileOutputStream("c:/data/산책2.txt");
            is.transferTo(os);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
