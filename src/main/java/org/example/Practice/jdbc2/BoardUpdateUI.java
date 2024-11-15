package org.example.Practice.jdbc2;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no_value = sc.nextInt(); //ice
        System.out.print("writer입력>> ");
        String writer_value = sc.next(); //9999
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 insert해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 insert()호출!
        BoardDAO dao = new BoardDAO();
        dao.update(no_value, writer_value);
    }
}
