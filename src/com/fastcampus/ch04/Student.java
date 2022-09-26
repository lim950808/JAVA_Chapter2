package com.fastcampus.ch04;
// 04. 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다
public class Student {
    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() { // studentName을 반환하므로 반환 값은 String이 됨.
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}