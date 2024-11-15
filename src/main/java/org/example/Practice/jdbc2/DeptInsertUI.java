package org.example.Practice.jdbc2;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("dno입력>> ");
        int no_value = sc.nextInt();
        System.out.print("dname입력>> ");
        String name_value = sc.next();
        System.out.print("loc입력>> ");
        String loc_value = sc.next();
        sc.close();

        DeptDAO dao = new DeptDAO();
        dao.insert(no_value, name_value, loc_value);
    }
}
