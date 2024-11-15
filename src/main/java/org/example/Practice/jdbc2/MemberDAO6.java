package org.example.Practice.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO6 {
    public static void main(String[] args) throws Exception {
        // 1. 드라이버 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        // 2. DB 연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");

        // 3. 반복문을 사용하여 데이터를 다중 삽입
        int numberOfRecords = 100000; // 데이터 개수 (100개 또는 1000개로 설정 가능)

        String sql = "INSERT INTO member (id, pw, name, tel) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        for (int i = 1; i <= numberOfRecords; i++) {
            ps.setString(1, "id" + i);     // id 값
            ps.setString(2, "pw" + i);     // pw 값
            ps.setString(3, "name" + i);   // name 값
            ps.setString(4, "tel" + i);    // tel 값
            if(i%1000==0) System.out.println("%d개 들어감".formatted(i));
            ps.addBatch(); // Batch에 추가
        }

        int[] results = ps.executeBatch(); // 일괄 전송
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row 수 --> " + results.length + "개");

        // 자원 해제
        ps.close();
        con.close();
    }
}