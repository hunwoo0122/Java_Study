package org.example.day15.Collection;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("박소정");
        li.add("김경민");
        li.add("소지현");
        li.add("김개빈");

        System.out.println("초기 참가자 목록: " + li);

        li.remove("김경민");

        System.out.println("탈락 후 참가자 목록: " + li);

        List<String> li2 = new ArrayList<>();
        li2.add("국어");
        li2.add("수학");
        li2.add("영어");
        li2.add("컴퓨터");

        System.out.println("처음 시험별 과목: " + li2);
        li2.remove("국어");
        System.out.println("1회차 시험을 한 날은 과목: " + li2);
        li2.remove("수학");
        System.out.println("2회차 시험을 한 날은 과목: " + li2);
        li2.remove("영어");
        System.out.println("3회차 시험을 한 날은 과목: " + li2);
    }
}
