package org.example.Seven;

import org.example.Seven.students.Student;

import java.util.ArrayList;
import java.util.stream.Collectors;
//Взять наш класс Student ( или сделать свой) изменить имена и фамилии на заглавные и сгруппировать по курсу стримом
public class Seven {
    public static void main(String[] args) {
        Student st1 = new Student("Uliana", 'f', 25, 2, 7.4);
        Student st2 = new Student("Elina", 'f', 24, 3, 8.4);
        Student st3 = new Student("Pavel", 'm', 27, 3, 9.4);
        Student st4 = new Student("Alexander", 'm', 30, 2, 6.5);
        Student st5 = new Student("Anatoli", 'm', 32, 3, 9.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream()
                .map(s -> {
                    s.setName(s.getName().toUpperCase());
                    return s;
                })
                .collect(Collectors.groupingBy(s -> s.getCourse()))
                .entrySet()
                .stream()
                .forEach(System.out::println);
    }
}
