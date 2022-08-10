package com.codegym;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "University of Languages and International Studies";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void change() {
        college = "Kansai University";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

