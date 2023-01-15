package org.example.hw_12_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

//3**. Дана стринга  String ss = "KikJhYggfTgf" ( это пример )
//        вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ
public class Three_InFile {
    public static void main(String[] args) {
        int i = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = reader.readLine()) != null) {
                i++;
                System.out.println(i + " : string");
                str.chars()
                        .mapToObj(s -> (char) s)
                        .filter(Character::isLetter)
                        .collect(Collectors.groupingBy(Character::isLowerCase, Collectors.counting()))
                        .forEach((k, v) -> System.out.println("isLowerCase - " + k + ": " + v));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
