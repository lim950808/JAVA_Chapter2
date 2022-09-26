package com.fastcampus.ch18;

import java.util.Calendar;
// 18. static 응용 - 싱글톤 패턴(singleton pattern)
public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = Company.getInstance(); // static 메서드인 getInstance()를 사용해서 company1 생성
        Company company2 = Company.getInstance();

        System.out.println(company1); // com.fastcampus.ch18.Company@1134affc
        System.out.println(company2); // com.fastcampus.ch18.Company@1134affc

        Calendar calendar = Calendar.getInstance(); // 유일한 객체를 사용할 때 싱글톤 패턴을 쓴다.
    }
}
