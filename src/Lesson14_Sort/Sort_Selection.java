package Lesson14_Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort_Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println("Array before sort : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sort : " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] array) {
        int min;
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}
