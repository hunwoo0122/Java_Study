package org.example.Practice.Class2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deep_Q1 {
    public static void main(String[] args) {
        String text = "안녕하세요. 제 전화번호는 010-1234-5678이고 , 회사 번호는 02-9876-5432입니다.";

        // 전화번호를 찾는 정규 표현식 \\d{3}은 3자리 숫자, \\d{3,4}는 3자리 또는 4자리숫자
        // \\d{4}는 4자리 숫자 (전화번호 뒷부분)
        String regex = "\\b(\\d{3}-\\d{3,4}-\\d{4})\\b";

        // 정규 표현식과 일치하는 부분을 찾아내어 출력
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("전화번호를 찾아냈습니다:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
