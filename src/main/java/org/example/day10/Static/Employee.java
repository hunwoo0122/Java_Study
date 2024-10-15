package org.example.day10.Static;

public class Employee {
    String name;
    int age;
    String gender;
    static int count;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);
    }
}
