package org.example.day19.DesignPattern;

import java.util.Arrays;
import java.util.List;

public class AirCon implements Observer{
    // 관리자 리스트
    List<String> managers = Arrays.asList("alice", "hong", "park");

    void setTemp(int temp){
        for (String s: managers){
            System.out.println(s + "님 ");
            update(temp);
        }
    }

    public void update(int temp) {
        System.out.println(temp + "도가 변경되었습니다.");
    }
}
