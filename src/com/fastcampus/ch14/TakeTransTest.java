package com.fastcampus.ch14;
// 14. 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000); // James의 남은 돈 5000원
        Student studentT = new Student("Tomas", 10000); // Tomas의 남은 돈 10000원

        Bus bus100 = new Bus(100); // 100번 버스

        Subway subwayGreen = new Subway(2); // 지하철 2호

        studentJ.takeBus(bus100); // James가 100번 버스에 승차
        studentT.takeSubway(subwayGreen); // Tomas가 2호선 지하철에 승차

        // James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
        // James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
        // Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
        // 두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.

        studentJ.showInfo(); // James님의 남은 돈은 4000원 입니다
        studentT.showInfo(); // Tomas님의 남은 돈은 8800원 입니다

        bus100.showBusInfo(); // 100번 버스의 승객은 1명 이고, 수입은 1000원 입니다
        subwayGreen.showSubwayInfo(); // 2번 지하철의 승객은 1명 이고, 수입은 1200원 입니다
    }
}