package org.example.Practice.jdbc2;

import java.util.Scanner;

//데이터 삽입
public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no_value = sc.nextInt(); //apple
        System.out.print("title입력>> ");
        String title_value = sc.next(); //1234
        System.out.print("content입력>> ");
        String content_value = sc.next(); //apple
        System.out.print("writer입력>> ");
        String writer_value = sc.next(); //1111
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 insert해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 insert()호출!
        BoardDAO dao = new BoardDAO();
        dao.insert(no_value, title_value, content_value, writer_value);
    }
}
