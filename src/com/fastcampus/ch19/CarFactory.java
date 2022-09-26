package com.fastcampus.ch19;
// 19. 복습해봅시다 (static과 싱클톤 패턴)
public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}