package org.example.Eleven;

public class Eleven {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 9;
        System.out.println(getIndex(arrInt, a));
    }
    private static String getIndex(int[] arr, int a){
        String res = "";
        int no = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                int tmp = arr[i] + arr[j];
                if (tmp == a){
                    res = res + " : " + i + "," + j;
                     no = 1;
                }
        }}
        if (no == 0)
            res = " такое число не найдено ";
        return res;
    }
}
