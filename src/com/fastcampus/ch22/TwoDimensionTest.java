package com.fastcampus.ch22;
// 22. 2차원 배열 사용하기
public class TwoDimensionTest {
    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6,7} };
        int i, j;

        for(i=0; i<arr.length; i++) {                   // i: 행
            for(j=0; j<arr[i].length; j++) {            // j: 열
                System.out.print(arr[i][j] + " ");      // arr[행][열]
            }
            System.out.println(", \t" + arr[i].length);
            //1 2 3 , 	3
            //4 5 6 7 , 	4
        }

    }
}