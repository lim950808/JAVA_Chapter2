package com.fastcampus.ch14;
// 14. 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber; // 노선 번호
    }

    public void take(int money) { // 지하철 승가
        this.money += money; // 요금 추가
        passengerCount++; // 승객 추가
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "호선 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}