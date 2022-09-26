package com.fastcampus.ch10;
// 10. 접근 제어 지시자(access modifier)와 정보은닉(infomation hiding)
public class Birthday {

    private int day;
    private int month;
    private int year;

    private boolean isValid; // default 값은 false

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ( month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }

}