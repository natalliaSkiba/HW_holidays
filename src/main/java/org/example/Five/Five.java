package org.example.Five;

import java.util.Arrays;
import java.util.Comparator;
//Отсортировать строки в алфавитном порядке стримом и в обратном
public class Five {
    public static void main(String[] args) {
        String str = """
                Не очеловечивайте компьютеры - они этого не любят
                """;
        String[] arrayStr = str.toLowerCase().split("\\P{LD}+");
        System.out.println(Arrays.toString(arrayStr));
        Arrays.stream(arrayStr)
                .sorted()
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
     }
}
