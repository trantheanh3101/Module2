package Lesson14_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println("Array before sort : " + Arrays.toString(arr));

        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int pos,x;
//        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            System.out.println("round " + i);
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                System.out.println("Swap " + arr[pos] + " with " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        System.out.println( " Array after sort : " + Arrays.toString(arr));
    }
}
