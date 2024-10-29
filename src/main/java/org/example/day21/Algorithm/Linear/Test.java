package org.example.day21.Algorithm.Linear;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] * 10;
        }
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(Arrays.toString(list));


    }
}
