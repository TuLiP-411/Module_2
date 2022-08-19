package controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Hoa", 22, "Nam Dinh");
        Student st2 = new Student("Ngan", 23, "Hai Duong");
        Student st3 = new Student("Phuc", 21, "Ha Noi");
        Student st4 = new Student("Nam", 20, "Thanh Hoa");
        Student st5 = new Student("Dai", 28, "Ben Tre");

        Map<Integer, Student> mapStudent = new HashMap<Integer, Student>();
        mapStudent.put(1, st1);
        mapStudent.put(2, st2);
        mapStudent.put(3, st3);
        mapStudent.put(4, st4);
        mapStudent.put(5, st5);
        for (Map.Entry<Integer, Student> student : mapStudent.entrySet()
        ) {
            System.out.println(student.toString());
        }
        System.out.println("------------------Set------------------");

        Set<Student> students = new HashSet<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        for (Student st : students
        ) {
            System.out.println(st.toString());
        }
    }
}
