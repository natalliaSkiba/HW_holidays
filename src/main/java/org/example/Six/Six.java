package org.example.Six;
import java.util.Arrays;
//Дан массив интов - вывести на экран все четные числа
public class Six {
    public static void main(String[] args) {
        int [] arrInt = {23,56,7,8,98,45,66,77,32};
        Arrays.stream(arrInt)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
    }
}
