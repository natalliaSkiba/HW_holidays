package org.example.Four;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Four {
    public static void main(String[] args) {
       Stream stream = Stream.of("we", "wee", "qwer", "oooo", "djhgjdhbvjh", "dhjh", "df")
               .sorted((w1, w2) -> w2.length() - w1.length())



               .max((w1, w2) -> Integer.parseInt(Comparator.comparing(String::length).toString())).stream();


//List<Integer> list = List.of(1, 3, 5, 3, 2, 3, 5);
//  list.stream().filter(i -> i == (list.stream().max(Comparator.comparingInt(i2 -> i2))).get()).forEach(System.out::println);
//stream().collect(
//            maxAll(Comparator.comparingInt(String::length), Collectors.joining(","))));


     }
}
