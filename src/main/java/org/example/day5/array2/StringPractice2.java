package org.example.day5.array2;

import java.util.Arrays;

public class StringPractice2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        //1. String[]로 바꾸어보세요.
        String[] subjects = all.split(", ");
        System.out.println(Arrays.toString(subjects));
        //2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시 배열에 넣으시오
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = subjects[i].trim();
        }
        System.out.println(Arrays.toString(subjects));
        //3. 과목수는?
        System.out.println("과목수: " + subjects.length);
        //4. 컴퓨터의 위치는?
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals("컴퓨터")) {
                System.out.println("컴퓨터의 위치: " + i);
                break;
            }
        }
        //5. 과목명이 3글자 미만인 과목수는?
        int count = 0;
        for (String subject : subjects) {
            if (subject.length() < 3) {
                count++;
            }
        }
        System.out.println("3글자 미만인 과목수: " + count);

    }
}
