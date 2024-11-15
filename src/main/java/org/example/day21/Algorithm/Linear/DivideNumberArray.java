package org.example.day21.Algorithm.Linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivideNumberArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        Solution4 s = new Solution4();
        int[] a = s.solution(arr, 5);
        System.out.println(Arrays.toString(a));
    }
}

class Solution4 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);
        if (list.size() == 0) {
            list.add(-1);
        }
        int[] res = list.stream().mapToInt(i -> i).toArray();
        return res;
    }
}