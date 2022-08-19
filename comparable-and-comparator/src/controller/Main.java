package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Hoa", 22, "Nam Dinh");
        Student st2 = new Student("Ngan", 23, "Hai Duong");
        Student st3 = new Student("Phuc", 23, "Ha Noi");
        Student st4 = new Student("Nam", 20, "Thanh Hoa");
        Student st5 = new Student("Dai", 28, "Ben Tre");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println("Original list: ");
        for (Student u : studentList
        ) {
            System.out.println(u.toString());
        }

        Collections.sort(studentList);
        System.out.println("-----------Sort by name:----------------- ");
        for (Student u : studentList
        ) {
            System.out.println(u.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("-----------Sort by age:----------------- ");
        for (Student u : studentList
        ) {
            System.out.println(u.toString());
        }
    }
}
