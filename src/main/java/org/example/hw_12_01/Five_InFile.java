package org.example.hw_12_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Отсортировать строки в алфавитном порядке стримом и в обратном

public class Five_InFile {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                String[] arrayStr = s.replaceAll("[„“°¦—«»…,–!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "").toLowerCase().split(" ");
                for (int i = 0; i < arrayStr.length; i++)
                    stringList.add(arrayStr[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stringList.stream()
                .sorted()
                .peek(e-> System.out.print(e + " " ))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
