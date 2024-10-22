package org.example.day14.Crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

// 백준 사이트 문제정보 크롤링
public class CrawlingSite {
    Document doc = null;

    // 백준 표에서 title 정보를 가져옴 (문제. 문제제목. 맞힌사람. 제출. 정답비율)
    public String[] getTitle() throws IOException {
        doc = Jsoup.connect("https://www.acmicpc.net/problemset").get();

        // 타이틀
        Elements title = doc.select("thead tr th");
        // System.out.println(title);
        // System.out.println(title.size());

        // 받아온 Elements 수만큼 문자열 배열 생성
        String[] data = new String[title.size()];
        // text() 활용 title 데이터 저장
        for (int i = 0; i < title.size(); i++) {
            data[i] = title.get(i).text();
        }
        return data;
    }

    // 문제 세부 정보를 받는 메소드
    public String[] getContent() throws IOException {
        doc = Jsoup.connect("https://www.acmicpc.net/problemset/").get();

        // 문제의 세부정보 저장 Element
        Elements problemInfo = doc.select("tbody tr td");
        // System.out.println(tempInfo);
        // System.out.println(tempInfo.size());

        // 총 받아온 세부정보 만큼 문자열 배열 생성
        String[] data = new String[problemInfo.size()];
        // text() 활용 세부정보 저장
        for (int i = 0; i < problemInfo.size(); i++) {
            data[i] = problemInfo.get(i).text();
        }
        return data;
    }
}
