package org.example.Practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop2"; // DB URL은 실제로 사용하는 값으로 변경하세요.
        String user = "root"; // DB 사용자명
        String password = "1234"; // DB 비밀번호

        Scanner scanner = new Scanner(System.in);

        System.out.print("삭제할 deptNo>> ");
        int deptNo = scanner.nextInt();

        String sql = "DELETE FROM dept2 WHERE DEPTNO = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL 자바 연결 DRIVER 설정 성공.");
            System.out.println("MySQL 연결 성공.");

            pstmt.setInt(1, deptNo);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("데이터 삭제 성공.");
            } else {
                System.out.println("해당 deptNo를 가진 데이터가 없습니다.");
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
