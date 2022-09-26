package com.fastcampus.ch11;
// 11. 캡슐화 (encapsulation)
public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport report = new MakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}