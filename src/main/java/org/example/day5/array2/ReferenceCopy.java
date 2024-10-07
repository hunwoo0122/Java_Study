package org.example.day5.array2;

import java.util.ArrayList;
import java.util.List;

public class ReferenceCopy {
    public static void main(String[] args) {
        /*
        int[] term1 = {100, 200, 300};
        int[] term2 = term1.clone();
        term2[0] = 96;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        System.out.println(term1 + " " + term2); // 주솟값 출력
         */
        String[] subject = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] first_grade = {44, 66, 22, 99, 100};
        int[] second_grade = first_grade.clone();
        second_grade[0] = 22;
        second_grade[2] = 88;

        for (int i = 0; i < first_grade.length; i++) {
            System.out.print(first_grade[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second_grade.length; i++) {
            System.out.print(second_grade[i] + " ");
        }
        int cnt = 0;
        for (int i = 0; i < first_grade.length; i++) {
            if (first_grade[i] == second_grade[i]) {
                cnt++;
            }
        }
        System.out.println();
        System.out.println("1,2학기 성적중 동일한 성적과목 수 " + cnt + "개");
        int cnt2 = 0;
        int index = 0;
        for (int i = 0; i < second_grade.length; i++) {
            if (first_grade[i] < second_grade[i]) {
                cnt2++;
                index = i;
            }
        }
        System.out.println("1,2학기 성적중 오른 과목 수 " + cnt2 + "개");
        if (cnt2 > 0) {
            System.out.println("오른 과목 명: " + subject[index]);
        }

        List<String> improvedSubjects = new ArrayList<>(); // 성적이 오른 과목을 저장하는 리스트

        for (int i = 0; i < second_grade.length; i++) {
            if (first_grade[i] < second_grade[i]) {
                cnt2++;
                improvedSubjects.add(subject[i]); // 성적이 오른 과목명을 리스트에 추가
            }
        }
        System.out.println("1,2학기 성적중 오른 과목 수 " + cnt2 + "개");

        /* 오른 과목 수가 여러개 일때 과목명을 출력하는 방법
        int cnt3 = 0;
        List<String> improvedSubjects = new ArrayList<>(); // 성적이 오른 과목을 저장하는 리스트

        for (int i = 0; i < second_grade.length; i++) {
            if (first_grade[i] < second_grade[i]) {
                cnt3++;
                improvedSubjects.add(subject[i]); // 성적이 오른 과목명을 리스트에 추가
            }
        }
        System.out.println("1,2학기 성적중 오른 과목 수 " + cnt2 + "개");

        // 성적이 오른 과목 명 출력
        if (cnt2 > 0) {
            System.out.print("오른 과목 명: ");
            for (String subj : improvedSubjects) {
                System.out.print(subj + " ");
            }
            System.out.println(); // 줄바꿈

         */
    }
}
