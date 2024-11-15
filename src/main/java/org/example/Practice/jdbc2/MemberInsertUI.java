package org.example.Practice.jdbc2;

import java.util.Scanner;

//데이터 삽입
public class MemberInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id_value = sc.next(); //apple
        System.out.print("pw입력>> ");
        String pw_value = sc.next(); //1234
        System.out.print("name입력>> ");
        String name_value = sc.next(); //apple
        System.out.print("tel입력>> ");
        String tel_value = sc.next(); //1111
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 insert해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 insert()호출!
        MemberDAO4 dao = new MemberDAO4();
        dao.insert(id_value, pw_value, name_value, tel_value);
    }
}
