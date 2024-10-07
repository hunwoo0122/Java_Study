package org.example.day6.array3;

public class Dimension2Array2 {
    public static void main(String[] args) {
        int[][] n2 = new int[3][];
        //변수 개수 ==> 5개
        System.out.println(n2.length);
        //총 메모리(참조형 4바이트) ==> 20
        //n2, n2[0], n2[1], n2[2] ==> 16
        //length ==> 4
        System.out.println(n2[0]);
        System.out.println(n2);
        //1차원 배열 3개를 만들어서 껴보자.
        //한 줄 복사: 컨트롤 + D
        int[] r0 = new int[10];
        int[] r1 = new int[15];
        int[] r2 = new int[12];
        System.out.println(r0);
        n2[0] = r0;
        n2[1] = r1;
        n2[2] = r2;
        System.out.println(n2[0].length);

        //n2를 pretty하게 찍어보자.!
        //한 행당 가로 한 줄에 찍어보자.
        //행 0->1
        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                System.out.println(n2[i][j]);
            }
        }
    }
}