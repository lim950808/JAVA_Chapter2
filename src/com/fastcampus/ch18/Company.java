package com.fastcampus.ch18;
// 18. static 응용 - 싱글톤 패턴(singleton pattern)
public class Company {

    private static Company instance = new Company();

    private Company() {

    }

    public static Company getInstance() { // static을 적어줘야 외부에서 getInstance()라는 메서드 이름으로 사용 가능
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
