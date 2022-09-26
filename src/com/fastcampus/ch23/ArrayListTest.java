package com.fastcampus.ch23;

import com.fastcampus.ch21.Book;
import java.util.ArrayList;
// 23. 객체 배열을 구현한 클래스 ArrayList
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>(); // ch21에 있던 Book.java를 import

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for(int i =0; i<library.size(); i++) {
            library.get(i).showInfo(); // ch21에 있던 Book.java의 showInfo() 메서드 사용
            //태백산맥1, 조정래
            //태백산맥2, 조정래
            //태백산맥3, 조정래
            //태백산맥4, 조정래
            //태백산맥5, 조정래
        }

    }
}
