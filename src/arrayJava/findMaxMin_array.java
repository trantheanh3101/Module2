package arrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class findMaxMin_array {
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

        System.out.println("array : " + Arrays.toString(array));

        System.out.print("value max in array is : " + findItemMax(array) + "\n");
        System.out.print("value min in array is : " + findItemMin(array));

    }

    public static int findItemMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findItemMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
