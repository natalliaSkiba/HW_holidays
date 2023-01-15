package org.example.Nine;

import java.util.*;
//9*. Дано String s = "AAGGTFFDDVVAA" или похожая.
//        Вывести на экран кол-во повторений в таком виде
//        "4A2G1T2F2D2V"
public class Nine {
    public static void main(String[] args) {
        String s = "AAFFFGGYYYYYRR";
        Map<Character, Integer> map = new LinkedHashMap<>();
        if (strException(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                } else {
                    int val = map.get(s.charAt(i));
                    map.put(s.charAt(i), ++val);
                }
            }
            for (Map.Entry<Character, Integer> mapPrint : map.entrySet()) {
                System.out.print(mapPrint.getValue() + "" + mapPrint.getKey());
            }
        } else
            System.out.println("Please only Alphabet letters");
    }
    private static boolean strException(String s) {
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                res = true;
            } else
                return false;
        }
        return res;
    }
}



