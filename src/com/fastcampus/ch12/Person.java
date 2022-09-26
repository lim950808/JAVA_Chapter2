package com.fastcampus.ch12;
// 12. 객체 자신을 가리키는 this
public class Person {
    String name;
    int age;

    public Person() {
        this("no name", 1); // this 위에는 다른 값이 올 수는 없다.
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() {
        return this; // 2. 여기에서 this로 반환된
    }

    public static void main(String[] args) {
        Person person = new Person(); // 1. 여기서 생성된 person의 값과
        person.showPerson();

        System.out.println(person); // com.fastcampus.ch12.Person@22f71333

        Person person2 = person.getPerson(); // 3. person2의 값이 같은 것을 볼 수 있다.
        System.out.println(person2); // com.fastcampus.ch12.Person@22f71333
    }
}
