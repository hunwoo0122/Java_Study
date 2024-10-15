package org.example.day10.Static;

public class BankBook {
    String name;
    String ssn;
    int money;
    static int count; // 메서드 영역에 static이 만들어진다.
    // 스태틱은 정적으로 값을 할당받음?
    //static키워드가 붙어있는 변수는
    //객체생성와 상관없이
    //클래스에서 바로 접근해서 사용 가능한 변수
    //정적변수, static변수, 클래스 변수
    //"클래스명.변수명" 접근해서 사용 가능
    //1)객체마다 공유할 목적으로!(누적용)
    //2)객체생성하지 않고 언제든지 접근해서 사용 목적으로!
    public BankBook(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
    }

    @Override
    public String toString() {
        return "BankBook{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
