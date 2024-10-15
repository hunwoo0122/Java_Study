package org.example.day10.Static;

public class MakingCompany {
    public static void main(String[] args) {
        Employee work1 = new Employee("홍길동", 25, "여");
        Employee work2 = new Employee("김길동", 24, "남");
        Employee work3 = new Employee("송길동", 26, "여");

        System.out.println("우리 회사의 직원수는? " + Employee.count+"명");
        work1.printInfo();
        work2.printInfo();
        work3.printInfo();
        System.out.println((work1.age + work2.age + work3.age)/3);
    }
}
