package org.example.hw_12_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Book {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Abbat.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArr = line.replaceAll("[„“°¦—«»…,–!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "")
                        .toLowerCase().split(" ");
                for (int i = 0; i < lineArr.length; i++) {
                    wordList.add(lineArr[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        wordList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

