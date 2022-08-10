package com.codegym;

public class Test {
    public static void main(String[] args) {
        Student str1 = new Student();
        Student str2 = new Student();
        System.out.println(str1.toString());
        System.out.println(str2.toString());
        str1.setName("Hannah");
        str1.setClasses("co6");
        System.out.println(str1.toString());
        str2.setName("Jonathan");
        str2.setClasses("vo hok");
        System.out.println(str2.toString());
    }


}
