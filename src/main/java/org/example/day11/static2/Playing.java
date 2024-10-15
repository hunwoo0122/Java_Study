package org.example.day11.static2;

public class Playing {
    public static void main(String[] args) {
        Exercise w1 = new Exercise("테니스", "친구", 3);
        Exercise w2 = new Exercise("러닝", "동네모임", 2);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println(Exercise.count);
        System.out.println(Exercise.getTime());
        //System.out.println(Exercise.getTime());
        //String s = System.out.println();
    }
}
