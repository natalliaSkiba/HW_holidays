package org.example.One;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class One {
    public static void main(String[] args) {
        String str = "my name is";
        System.out.println(
                Arrays.stream(str.replaceAll("\\p{Punct}", "").toLowerCase().split(" "))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
        );
    }
}
