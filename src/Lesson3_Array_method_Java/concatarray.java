package Lesson3_Array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class concatarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[7];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("fill item " + i + " of arr1 : ");
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("fill item " + i + " of arr2 : ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        int[] arr3 = concatArr(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] concatArr(int[] array1, int[] array2){

        int[] arr3 = new  int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            arr3[i] = array1[i];
        }

        for (int i = array1.length; i < arr3.length; i++) {
            arr3[i] = array2[i-array1.length];
        }
        return arr3;
    }
}
