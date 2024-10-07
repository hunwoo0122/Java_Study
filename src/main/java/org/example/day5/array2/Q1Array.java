package org.example.day5.array2;

import java.util.Arrays;
import java.util.Random;

public class Q1Array {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("MAX: " + a[a.length - 1]);
        System.out.println("MIN: " + a[0]);
    }
}
