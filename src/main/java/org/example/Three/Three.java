package org.example.Three;
import java.util.stream.Collectors;
//3**. Дана стринга  String ss = "KikJhYggfTgf" ( это пример )
//        вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ
public class Three {
    public static void main(String[] args) {
        String ss = "KikJhYggfTgf";
        ss.chars()
                .mapToObj(s -> (char) s)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Character::isLowerCase, Collectors.counting()))
                .forEach((k,v) -> System.out.println("isLowerCase - " + k + ": " + v));
    }
}
