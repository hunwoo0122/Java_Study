package org.example.day14.Crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MovieCrawlmain {
    public static void main(String[] args) {
        try {
            // Naver 영화 랭킹 페이지에 접속
            Document doc = Jsoup.connect("https://serieson.naver.com/v3/movie/ranking/realtime").get();

            // 영화 이름을 포함하는 HTML 요소 찾기 (적절한 CSS 선택자 사용)
            Elements movieElements = doc.select("span.Title_title__s9o0D"); // 실제 선택자는 페이지 구조에 맞게 변경 필요

            // 영화 제목들 출력
            for (int i = 0; i < movieElements.size(); i++) {
                String movieTitle = movieElements.get(i).text();
                System.out.println((i + 1) + ". " + movieTitle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
