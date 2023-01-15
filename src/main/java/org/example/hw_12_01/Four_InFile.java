package org.example.hw_12_01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//4*. Дан стрим  Stream stream = Stream.of("we", "wee", "qwer", "oooo");
//        ( или любой другой…не суть )
//        Вывести на экран СТРИМОМ самую длинную строку. Если несколько одинаковых, то значит несколько.

public class Four_InFile {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null){
                String [] arrStr = str.replaceAll("[„“°¦—«»…,–!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]","").toLowerCase().split(" ");
                for (int i = 0; i < arrStr.length; i++){
                    stringList.add(arrStr[i]);
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
stringList.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.<Integer, List<String>>comparingByKey())
                .ifPresent(e -> System.out.println(e.getValue()));
    }
}
