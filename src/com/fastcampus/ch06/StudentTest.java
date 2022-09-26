package com.fastcampus.ch06;
// 06. 생성자에 대해 알아봅시다 (constructor)
public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        System.out.println(studentLee.showStudentInfo()); // null학생의 학번은 0이고, 0학년 입니다.

        Student studentKim = new Student(12345, "Kim", 3);
        System.out.println(studentKim.showStudentInfo()); // Kim학생의 학번은 12345이고, 3학년 입니다.

    }
}