package org.example.Twelve;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//12 ** Написать метод который принимает стрингу из нескольких слов и возвращает перевернутое предложение.
// ВОЗВРАЩАЕМОЕ ЗНАЧЕНИЕ STRING!
//        input -> my name is
//        out -> is name my
public class Twelve {
    public static void main(String[] args) {
        String strIn = "my name is";
        List<String> world = Arrays.asList(strIn.split(" "));
        System.out.println(reversString(world));
    }
    private static String reversString(List<String> s) {
        Collections.reverse(s);
        return String.join((" "),s);
    }
}