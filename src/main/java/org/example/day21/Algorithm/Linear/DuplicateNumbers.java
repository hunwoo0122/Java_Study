package org.example.day21.Algorithm.Linear;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        Solution6 s = new Solution6();
        int a = s.solution(arr, 1);
        System.out.println(a);
    }
}

class Solution6 {
    public int solution(int[] arr, int n) {
        int answer = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == n){
                answer++;
            }
        }
        return answer;
    }
}