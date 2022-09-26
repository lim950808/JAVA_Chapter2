package com.fastcampus.ch20;
// 20. 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(array)
public class CharArrayTest {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A'; // 초기값 'A'

        for (int i=0; i<alphabets.length; i++) {
            alphabets[i] = ch++; // 배열에 하나씩 증가됨
        }

        for (char alpha : alphabets) { // 향상된 for문  // for(변수 : 배열)
            System.out.println(alpha + ", " + (int)alpha);
        }
    }
}
