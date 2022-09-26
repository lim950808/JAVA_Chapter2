package com.fastcampus.ch03;
// 03. 함수와 메서드
public class FunctionTest {
    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;

        // 0부터 100까지 더함
        for(i=0; i<=100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2); // n1과 n2를 받아와 addNum() 함수를 사용하여 total 안에 대입
        System.out.println(total); // 30

        sayHello("안녕하세요"); // 안녕하세요

        total = calcSum(); // calcSum() 함수 사용하여 total 안에 대입
        System.out.println(total); // 5050
    }
}