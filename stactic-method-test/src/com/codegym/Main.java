package com.codegym;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(001, "Nga");
        Student s2 = new Student(002, "Hoang");
        Student s3 = new Student(002, "Mai");
        Student.change();
        s1.display();
        s2.display();
        s3.display();
    }
}