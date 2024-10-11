package org.example.day8.usingclass;

import org.example.day8.makingclass.Calculater;

public class MyStore {
    public static void main(String[] args) {
        Calculater cal = new Calculater();
        int x = cal.plus(100, 200);
        int y = cal.plus(1000, 2000);
    }
}
