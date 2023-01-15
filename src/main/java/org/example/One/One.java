package org.example.One;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
//1.**** Создать стрим который принмает на вход Стрингу а на выходе выводит на экран кол-во слов и повторений данного слова:
//        inut-> my name is
//        out -> my : 1
//        name : 1
//        is : 1
public class One {
    public static void main(String[] args) {
        String str = "my name is";
        countWorld(str);
    }
    static void countWorld(String str) {
        System.out.println(
                Arrays.stream(str.replaceAll("\\p{Punct}", "").toLowerCase().split(" "))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
        );
    }
}
