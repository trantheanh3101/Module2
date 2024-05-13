package Lesson3_Array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("fill n: ");
        int n = sc.nextInt();

        System.out.println("n số đầu tiên của dãy số fibonacci: ");
        int[] fibonacciArray = fibonacciArray(n);
        System.out.println(Arrays.toString(fibonacciArray));
    }

    public static int[] fibonacciArray(int n) {
        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        if (n >= 3) {
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }
}
