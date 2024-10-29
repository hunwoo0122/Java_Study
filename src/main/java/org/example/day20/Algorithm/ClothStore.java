package org.example.day20.Algorithm;

public class ClothStore {
    public static void main(String[] args) {
        int result = 0;
        int price = 150000;
        if (price > 500000) {
            result =(int)(price - (price * 1/5));
        } else if (price > 300000) {
            result = (int)(price - (price * 1/10));
        } else {
            result = (int)(price - (price * 1/20));
        }
        System.out.println(result);
    }
}
