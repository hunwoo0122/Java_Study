package org.example.Practice.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//데이터 삭제
// MemberDAO2, MemberDAO3, MemberDAO4 를 한 파일에 넣는 파일로서 드라이버 설정과 DB연결을 생성자를 설정해 미리 실행해놓고
// 후의 삽입, 삭제, 수정 과정은 따로 메서드를 만들어서 실행
public class MemberDAO {
    Connection con; //전역변수가 됨, null로 초기화!
    //DAO클래스는 member테이블의 데이터를 접근해서
    //여러가지 기능을 정의하고 있는 클래스를 말함.
    //db테이블당 dao는 하나씩 만든다.
    //테이블이 1000개이면 dao는 1000개를 만든다.!
    public MemberDAO() throws Exception {
        //new MemberDAO()할 때 클래스이름과 동일한 메서드인 생성자메서드가
        //                    자동호출됨.(1-2단계를 실행해줌)
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public void update(String id값, String tel값)
            throws Exception {

        //3. sql준비 --> sql객체


        String sql = "update member set tel = ? where id = ?";
        //==> MemberDAO의 update메서드를 수정하세요.
        //==> MemberUpdateUI.java를 만들어서 update처리해보세요.!

        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tel값); //1은 ?번호
        ps.setString(2, id값);

        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    public void delete(String id값)
            throws Exception {

        //3. sql준비 --> sql객체

        String sql = "delete from member where id = ?";

        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id값); //1은 ?번호

        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    public void insert(String id값, String pw값, String name값, String tel값)
            throws Exception {
        //3. sql준비 --> sql객체


        String sql = "insert into member values (?,?,?,?)";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id값); //1은 ?번호
        ps.setString(2, pw값);
        ps.setString(3, name값);
        ps.setString(4, tel값);
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }
}
