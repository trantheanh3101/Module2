package array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] array;
        do {
            System.out.println("fill length array <= 20 : ");
            n = scanner.nextInt();
        } while ( n > 20 );

        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("fill item " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("before reverse: ");
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println("after reverse: ");
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
