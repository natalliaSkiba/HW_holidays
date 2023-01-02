package org.example.Three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

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
