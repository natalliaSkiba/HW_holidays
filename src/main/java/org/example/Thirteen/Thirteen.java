package org.example.Thirteen;

public class Thirteen {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -123;
        System.out.println(reversInt(a));
        System.out.println(reversInt(b));
    }

    private static String reversInt(int i) {
        System.out.println(i);
        int j = i;
        String res = "";
        int revers = 0;
        if (i / 10 != 0){
        while (i != 0) {
            int num = i % 10;
            revers = revers * 10 + num;
            i /= 10;
        }
        if ((j > 0 && revers >= 0) || (j < 0 && revers <= 0))
            res = "" + revers;
        else res = " превышен диапазон int ";}
        else res = "" + i;
        return res;
    }
}
