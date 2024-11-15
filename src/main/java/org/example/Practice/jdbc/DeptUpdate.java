package org.example.Practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop2"; // DB URL은 실제로 사용하는 값으로 변경하세요.
        String user = "root"; // DB 사용자명
        String password = "1234"; // DB 비밀번호

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 수정할 부서 번호와 위치를 입력받기
        System.out.print("수정할 deptNo>> ");
        int deptNo = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 제거

        System.out.print("새로운 loc>> ");
        String loc = scanner.nextLine();

        // SQL UPDATE 문
        String sql = "UPDATE dept2 SET LOC = ? WHERE DEPTNO = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL 자바 연결 DRIVER 설정 성공.");
            System.out.println("MySQL 연결 성공.");

            // PreparedStatement에 파라미터 설정
            pstmt.setString(1, loc);
            pstmt.setInt(2, deptNo);

            // 업데이트 실행
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("데이터 업데이트 성공.");
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
