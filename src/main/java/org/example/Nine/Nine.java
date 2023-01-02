package org.example.Nine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nine {
    public static void main(String[] args) {
        String s = "AAFFFGGYYYYYRR";
        char[] arrayStr = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arrayStr.length; i++) {
//выбросить исключение если не буква
            list.add(String.valueOf(arrayStr[i]));
        }
        for (int i = 0; i < list.size(); i++) {
            int cont = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    cont++;
                    list.remove(j);
                    j--;
                }
            }
            map.put(list.get(i), cont);
        }
          for (Map.Entry<String, Integer> mapPrint : map.entrySet()) {
            System.out.print(mapPrint.getValue() + "" + mapPrint.getKey());
        }
    }
}
