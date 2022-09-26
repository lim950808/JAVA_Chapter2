package com.fastcampus.ch09;

import java.util.Scanner;

// 09. 참조 자료형 변수
public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 95);

        Student studentKim = new Student(101, "Kim");
        studentKim.setKoreaSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);

        studentLee.showScoreInfo(); // Lee 학생의 총점은 195점 입니다.
        studentKim.showScoreInfo(); // Kim 학생의 총점은 179점 입니다.
    }
}