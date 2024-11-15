package org.example.Practice.Class2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID를 입력하세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String password = sc.nextLine();

        if ("root".equals(id) && "1234".equals(password)) {
            System.out.println("일기 작성을 시작합니다.");

            System.out.println("날짜를 입력하세요 (예: 20230612):");
            String date = sc.nextLine();
            System.out.println("제목을 입력하세요:");
            String title = sc.nextLine();
            System.out.println("내용을 입력하세요:");
            String content = sc.nextLine();

            String filename = date + ".txt";

            try (PrintWriter writer = new PrintWriter(filename)) {
                writer.println("제목: " + title);
                writer.println("내용: " + content);
                System.out.println("일기가 저장되었습니다: " + filename);
            } catch (IOException e) {
                System.out.println("파일 쓰기에 실패했습니다.");
                e.printStackTrace();
            }
        } else {
            System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
        }

        sc.close();
    }
}
