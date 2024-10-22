package org.example.day14.Crawling;

import javax.swing.*;

public class EconomicCrawlmain {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code입력");
        //005930, 035720
        EconomicCrawl naver = new EconomicCrawl();
        try {
            String data = naver.crawl(code);
            JOptionPane.showMessageDialog(null, data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
