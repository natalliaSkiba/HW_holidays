package org.example.Two;
import java.util.stream.Stream;
//2****. Написать 3 метода который который выводит на экран ЗНАЧЕНИЕ числа фибоначчи.
// Как выглядит ряд - погуглите [0 1 1 2 3 5 8 13 21 44……]
//        input -> 5
//        out -> 3
//        input -> 8
//        out -> 13
//        НАПИСАТЬ 3-МЯ СПОСОБАМИ [просто цикл, стримом, рекурсией]
public class Two {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("For : input -> " + n + " out -> " + getFibonacciValueFor(n));
        System.out.println("Recursion : input -> " + n + " out -> " + getFibonacciValueRecurs(n));
        System.out.println("Stream : input -> " + n + " out -> " + getFibonacciValueStream(n));
    }
    private static int getFibonacciValueFor(int n) {
        int result = -1;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            result = arr[i];
        }
        return result;
    }
    private static int getFibonacciValueRecurs(int n) {
        if (n <= 1) {
            return 0;
        } else {
            if (n == 2) {
                return 1;
            } else {
                return getFibonacciValueRecurs(n - 1) + getFibonacciValueRecurs(n - 2);
            }
        }
    }
    private static int getFibonacciValueStream(int n) {
        int result = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(t -> t[0])
                .max(Integer::compareTo)
                .get();
        return result;
    }
}
