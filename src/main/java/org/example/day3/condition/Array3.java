package org.example.day3.condition;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};
        System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(a[4]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        double[] b = {11.1, 22.2, 33.3};
        System.out.println(b[0] + b[1]);
        System.out.println(b[0] + b[2]);
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        char[] c = new char[4];
        c[0] = '남';
        c[1] = '여';
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(Arrays.toString(c));
        System.out.println(c.length);

        String[] d = new String[3];
        d[0] = "독일";
        d[1] = "스페인";
        d[2] = "영국";
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < d.length; i++) {
            if(i == 0){
                System.out.println("내가 첫 번째 가고 싶은 곳은 " + d[i] +"이고");
            }else if(i == 1){
                continue;
            }else{
                System.out.println("마지막 가고 싶은 곳은 " + d[i] +"이다.");
            }
        }
    }
}
