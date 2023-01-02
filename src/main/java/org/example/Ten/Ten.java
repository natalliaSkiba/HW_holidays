package org.example.Ten;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        String s = "otiwuklf";
        char[] arrS = s.toCharArray();
        System.out.println("" + getIndex(arrS));
    }
    private static String getIndex(char[] s) {
        System.out.println("введите символ ");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();
        System.out.println(s);
        String res = " нет символа";
        for (int i = 0; i < s.length; i++) {
            String tmp = String.valueOf(s[i]);
            if (tmp.equals(ch)) {
                res = "" + i;
            }
        }
        return res;
    }
}
