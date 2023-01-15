package org.example.Eleven;
//11***. Дан массив интов. Написать метод в который вы передаете массив и еще одно число.
//        Метод должен ВЕРНУТЬ ИНДЕКС ДВУХ ЧИСЕЛ СУММА КОТОРЫХ ДАЕТ ЭТО ЧИСЛО. ЕСЛИ ТАКОВЫХ НЕТ - СООБЩЕНИЕ.
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
