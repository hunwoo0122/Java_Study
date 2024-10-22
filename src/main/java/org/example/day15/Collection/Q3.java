package org.example.day15.Collection;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("자바");

        //list.add(new 사람());//불가능
        list.add(new ArrayList());//불가능?

        String s = (String)list.get(0); //강제 형변환

        list.add(100); // 자동형변환

        int i = (Integer)list.get(3);// 강제 형변환
    }
}
