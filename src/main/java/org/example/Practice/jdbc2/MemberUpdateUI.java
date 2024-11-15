package org.example.Practice.jdbc2;

import java.util.Scanner;

public class MemberUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id_value = sc.next(); //ice
        System.out.println("tel입력>> ");
        String tel_value = sc.next(); //9999
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 insert해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 insert()호출!
        MemberDAO dao = new MemberDAO();
        dao.update(id_value, tel_value);
    }
}
