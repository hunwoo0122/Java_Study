package org.example.day19.DesignPattern;

public class Main {
    public static void main(String[] args) {
        // DatabaseConnection 싱글톤 인스턴스를 3번 얻기
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        DatabaseConnection db3 = DatabaseConnection.getInstance();

        // 3개의 인스턴스 주소 비교
        System.out.println("db1 주소: " + db1);
        System.out.println("db2 주소: " + db2);
        System.out.println("db3 주소: " + db3);

        // 주소 비교
        if (db1 == db2 && db2 == db3) {
            System.out.println("3개의 인스턴스는 모두 동일한 객체입니다.");
        } else {
            System.out.println("인스턴스는 서로 다른 객체입니다.");
        }
    }
}
