package org.example.Practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// jdbc pdf파일 27페이지
public class DeptInsert {
    //DB처리만 담당하는 클래스 Data Access
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop2"; // DB URL은 실제로 사용하는 값으로 변경하세요.
        String user = "root"; // DB 사용자명
        String password = "1234"; // DB 비밀번호

        Scanner scanner = new Scanner(System.in);

        System.out.print("deptNo>> ");
        int deptNo = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 제거

        System.out.print("deptName>> ");
        String deptName = scanner.nextLine();

        System.out.print("loc>> ");
        String loc = scanner.nextLine();

        String sql = "INSERT INTO dept2 (DEPTNO, DNAME, LOC) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL 자바 연결 DRIVER 설정 성공.");
            System.out.println("MySQL 연결 성공.");

            pstmt.setInt(1, deptNo);
            pstmt.setString(2, deptName);
            pstmt.setString(3, loc);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("데이터 삽입 성공.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL 드라이버 로드 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL 오류: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}