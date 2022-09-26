package com.fastcampus.ch16;
// 16. 여러 인스턴스에서 고통으로 사용하는 변수를 선언하자 - static 변수
public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 입사 할 때마다 사원번호가 1000번부터 하나씩 늘어간다.
    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}