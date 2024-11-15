package org.example.day22.Solution;

public class FindNum2 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int order = 0; //index + 1
        //int --> String --> char[]
        String num2 = String.valueOf(num);
        //String num2 = num + "";
        char[] c = num2.toCharArray();
        // int index = Arrays.binarySearch(c, );
        for (int i = 0; i < c.length; i++) {
            if ((c[i] - '0') == k){
                order = i + 1;
            } //if
        } //for
        System.out.println(order);
    }
}
