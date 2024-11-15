package org.example.Practice.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptDAO {
    Connection con;

    public DeptDAO() throws Exception {
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        //2. db연결
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public void update(String no_value, String name_value)
        throws Exception {

        //3. sql준비 --> sql객체

        String sql = "update dept set name = ? where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(2, no_value);
        ps.setString(1, name_value);

        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate();
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();
    }

    public void delete(String no_value)
        throws Exception {

        String sql = "delete from dept where no = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, no_value);

        System.out.println("3. sql준비 --> sql객체 성공!");

        int result = ps.executeUpdate();
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();
    }

    public void insert(int no_value, String name_value, String loc_value)
        throws Exception {

        String sql = "insert into dept values (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no_value);
        ps.setString(2, name_value);
        ps.setString(3, loc_value);
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate();
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --? " + result + "개");

        ps.close();
        con.close();
    }
}
