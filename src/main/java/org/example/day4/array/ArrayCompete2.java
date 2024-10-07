package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCompete2 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {
                cnt++;
            }
        }
        System.out.println("2학기에 성적이 향상된 학생의 수 " + cnt + "명");

        for (int i = 0; i < term2.length; i++) {
            if (term2[i] == term1[i]) {
                cnt2++;
            }
        }
        System.out.println("1,2학기 성적이 동일한 학생의 수 " + cnt2 + "명");

        Scanner sc = new Scanner(System.in);
        int[] grade = new int[3];
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            System.out.print("숫자 입력 : ");
            grade[i] = sc.nextInt();
            sum += grade[i];
        }
        sc.close();
        System.out.println("합계 " + sum);
        System.out.println("평균 " + ((double) sum / 3));

        int[] n = new int[1000];
        Random r = new Random(44);
        int sum3 = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;
            sum3 += n[i];
        }
        System.out.println(Arrays.toString(n));
        int sum2 = 0;
        sum2 = n[0] + n[2] + n[4] + n[99] + n[889];
        System.out.println(sum2);
        System.out.println("합계는 " + sum3);
        System.out.println("평균은 " + ((double) sum3 / 5));

        Scanner sc2 = new Scanner(System.in);
        String[] mt = {"백두산", "한라산", "후지산"};
        System.out.print("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1");


    }
}
