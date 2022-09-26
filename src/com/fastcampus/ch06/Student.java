package com.fastcampus.ch06;
// 06. 생성자에 대해 알아봅시다 (constructor)
public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {} // default 생성자

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber; // this를 이용해 맴버변수를 지정함.
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}