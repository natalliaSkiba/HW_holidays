package org.example.Eight;

import java.util.Arrays;
import java.util.Comparator;
//Вывести 7  самых больших числе из массива чисел Стримом
public class Eight {
    public static void main(String[] args) {
        Integer[] arrInt = {23, 56, 7, 8, 98, 45, 66, 77, 32};
        Arrays.stream(arrInt)
                .sorted(Comparator.reverseOrder())
                .limit(7)
                .forEach(System.out::println);
    }
}
