package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열에 여러번 입력한 데이터를 넣어주는 패턴
        int[] save = new int[5];
        for (int i = 0; i <save.length; i++) {
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt(); // 모든 입력은 String --> int로 변경하는 기능으로 포함.
        }
        System.out.println(Arrays.toString(save));
        sc.close();
        Arrays.sort(save); //오름차순 정렬, 맨앞 최솟값, 맨끝 최댓값
        System.out.println("최소값 : " + save[0]);
        System.out.println("최댓값 : " + save[4]); // save.length - 1

        // 해당 인덱스까지 최댓값 넣는 변수 필요
        int max = save[0]; // 0이 안되는 경우는 마이너스중에 최댓값이 있을수 있기 때문에
        //for문 순회
        //if(max < save[i])이면, max = save[i]
        for (int i = 1; i < save.length; i++) {
            if (max < save[i]) {
                max = save[i];
            } //if
        }//for
        System.out.println(max);
    }
}
