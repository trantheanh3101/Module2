package Lesson14_Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Random().nextInt(100);
        }
//        Arrays.sort(array);
        System.out.println("Array before sort : " + Arrays.toString(array));

        bubbleSortByStep(array);
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            System.out.println("round " + (i + 1) );
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j]<arr[j-1]){
                    System.out.println("Swap " + arr[j] + " with " + arr[j - 1]);
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                System.out.println("Array is sorted in ascending order after the " + (i + 1) + " sort: " + Arrays.toString(arr));
                break;
            }
            System.out.println("After swap roound " + (i + 1) + " : " + Arrays.toString(arr));
        }


    }
}

