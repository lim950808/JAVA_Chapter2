package com.fastcampus.ch04;
// 04. 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다
// 05. 인스턴스 생성과 힙 메모리 (heap memory)
public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(); // Student 생성자를 통하여 studentLee라는 인스턴스를 만듬

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울시 강남구";
        //studentLee의 학생정보 출력
        studentLee.showStudentInfo();// 12345학번 학생의 이름은 Lee이고, 주소는 서울시 강남구입니다.

        Student studentKim = new Student(); // Student 생성자를 통하여 studentKim라는 인스턴스를 만듬
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";
        //studentKim의 학생정보 출력
        studentKim.showStudentInfo(); // 54321학번 학생의 이름은 Kim이고, 주소는 경기도 성남시입니다.

        System.out.println(studentLee); //com.fastcampus.ch04.Student@5f2050f6 // 힙 메모리에 저장된 가상 주소 (참조 값)
        System.out.println(studentKim); //com.fastcampus.ch04.Student@3b81a1bc // 힙 메모리에 저장된 가상 주소 (참조 값)
    }
}