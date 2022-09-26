package com.fastcampus.ch20;
// 20. 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(array)
public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0; // total이라는 변수 초기화

        for (int i=0, num=1; i<arr.length; i++) {
            arr[i] = num++; // 1부터 하나씩 증가된 숫자들의 배열
        }

        for ( int num : arr) { // 향상된 for문  // for(변수 : 배열)
            total += num; // arr 배열에 있는 num을 하나씩 더해서 total에 넣는다. // 1+2+...+10
        }

        System.out.println(total); // 55
    }
}
