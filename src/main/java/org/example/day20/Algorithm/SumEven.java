package org.example.day20.Algorithm;

public class SumEven {
    public static void main(String[] args) {
        int temp = 10;
        int sum = 0;
        for (int i = 0; i <= temp; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
