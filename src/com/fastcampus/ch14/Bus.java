package com.fastcampus.ch14;
// 14. 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber; // 버스 번호
    }

    public void take(int money) {  // 버스 승차
        this.money += money; // 요금 추가
        passengerCount++; // 승객 추가
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}