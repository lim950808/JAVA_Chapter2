package com.fastcampus.ch16;
// 16. 여러 인스턴스에서 고통으로 사용하는 변수를 선언하자 - static 변수
public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(Employee.getSerialNum()); // 1001  // getSerialNum()라는 메서드를 통해서 serialNum을 가져옴.

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId()); // 이순신님의 사번은 1001
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId()); //김유신님의 사번은 1002

    }
}