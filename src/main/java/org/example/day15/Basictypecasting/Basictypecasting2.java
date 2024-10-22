package org.example.day15.Basictypecasting;

import javax.swing.*;

public class Basictypecasting2 {
    public static void main(String[] args) {
        long x = 50L; // long은 int보다 바이트크기가 커서 setsize에 값을 넣어줄때 long타입을 넣을려면 int로 형변환해줘야 한다.
        JFrame f = new JFrame();
        f.setSize((int) x, 500);

        //기본형 형변환 중 강제형변환은
        //강제로 변환될 데이터 타입 범위안에 들어있어야 가능.

    }
}
