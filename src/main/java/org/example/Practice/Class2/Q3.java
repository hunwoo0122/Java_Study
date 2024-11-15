package org.example.Practice.Class2;

class Student {
    String id;
    String name;
    int grade;
    String department;
}

class Subject {
    String name;
    int score;
}

class Course {
    String courseName;
    int maxStudents;
    Student[] students;
    int studentCount;
    Subject[] subjects;
    int subjectCount;

    void addStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount++] = student;
        }
    }

    void addSubject(Subject subject) {
        if (subjectCount < maxStudents) {
            subjects[subjectCount++] = subject;
        }
    }

    void printCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Max students: " + maxStudents);
        System.out.println("Current Students: " + studentCount);
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student: " + students[i].name + " - " + students[i].department);
        }
        for (int i = 0; i < subjectCount; i++) {
            System.out.println("Subject: " + subjects[i].name);
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Course course = new Course();
        course.courseName = "Programming";
        course.maxStudents = 5;
        course.students = new Student[course.maxStudents];
        course.subjects = new Subject[course.maxStudents];
        course.studentCount = 0;
        course.subjectCount = 0;

        Student student = new Student();
        student.id = "202201";
        student.name = "Kim";
        student.grade = 1;
        student.department = "Computer Science";
        course.addStudent(student);

        Student student2 = new Student();
        student2.id = "202202";
        student2.name = "Park";
        student2.grade = 2;
        student2.department = "Computer Science";
        course.addStudent(student2);

        Subject subject = new Subject();
        subject.name = "JAVA";
        subject.score = 95;
        course.addSubject(subject);

        Subject subject2 = new Subject();
        subject2.name = "PYTHON";
        subject2.score = 90;
        course.addSubject(subject2);

        course.printCourseInfo();
    }
}
