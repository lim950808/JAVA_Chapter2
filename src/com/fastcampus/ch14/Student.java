package com.fastcampus.ch14;
// 14. 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) { // 버스 승차
        bus.take(1000); // 버스 요금 1000원
        this.money -= 1000; // 1000원 요금 지불
    }

    public void takeSubway(Subway subway) { // 지하철 승차
        subway.take(1200); // 지하철 요금 1200원
        this.money -= 1200; // 1200원 요금 지불
    }

    public void showInfo() {
        System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
    }
}