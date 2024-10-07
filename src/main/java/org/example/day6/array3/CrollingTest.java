package org.example.day6.array3;

import org.jsoup.Jsoup;

public class CrollingTest {
    public static void main(String[] args) {
        Jsoup.connect("https://finance.naver.com/sise/");
        System.out.println("인터넷 사이트 연결 성공.");
    }
}
