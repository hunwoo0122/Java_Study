package org.example.Practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// jdbc pdf파일 27페이지
public class SchoolDBConnect {
    //DB처리만 담당하는 클래스 Data Access
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school"; // DB URL은 실제로 사용하는 값으로 변경하세요.
        String user = "root"; // DB 사용자명
        String password = "1234"; // DB 비밀번호

        Connection conn = null;
        try {
            // 드라이버 설정
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL 자바 연결 DRIVER 설정 성공.");

            // DB 연결
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL 연결 성공.");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL 드라이버 로드 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DB 연결 실패: " + e.getMessage());
        } finally {
            // 연결 해제
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("DB 연결 해제 실패: " + e.getMessage());
            }
        }
    }
}