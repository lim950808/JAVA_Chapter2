package com.fastcampus.ch19;
// 19. 복습해봅시다 (static과 싱클톤 패턴)
public class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
