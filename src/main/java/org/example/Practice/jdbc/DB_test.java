package org.example.Practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// jdbc pdf파일 27페이지
public class DB_test {
    //DB처리만 담당하는 클래스 Data Access
    public static void main(String[] args) throws Exception { //exception의 체계도에서 2번째 개념범위가 넓다.
        //자바(언어)에서 db를 연결하는 프로그램 4단계
        //Java DB Connectivity(JDBC) 4단계
        //1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 드라이버 설정 성공!");

        //2단계 - DB연결 --> 데이터~!(실무 설정)
        String url = "jdbc:mysql://localhost:3306/shop2"; //ip+port+db명
        String id = "root";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2단계 shop2 db연결 성공!");

        //3단계 - SQL작성
        String sql = "insert into test values (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "10");
        ps.setString(2,"쉬는 시간 14분전");
        System.out.println("3단계 - sql문 객체화 완료");

        //4단계 - DBMS로 SQL문 전송
        int result = ps.executeUpdate(); //sql전송후 결과 받아온다.
        System.out.println("4단계 - sql문 전송 성공!");
        System.out.println("처리된 row수 " + result);
    }
}