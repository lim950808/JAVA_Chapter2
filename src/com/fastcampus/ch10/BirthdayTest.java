package com.fastcampus.ch10;
// 10. 접근 제어 지시자(access modifier)와 정보은닉(infomation hiding)
public class BirthdayTest {
    public static void main(String[] args) {

        Birthday date = new Birthday();

        date.setYear(2019);
        date.setMonth(3);
        date.setDay(30);

        date.showDate();
    }
}
