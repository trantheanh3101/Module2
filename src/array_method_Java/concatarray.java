package array_method_Java;

import java.util.Scanner;

public class concatarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[7];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("fill item " + i + " of arr1 : ");
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("fill item " + i + "of arr2 : ");
            arr2[i] = sc.nextInt();
        }
    }

    public static int[] concatArr(int[] array1, int[] array2){

        int[] arr3 = new  int[array1.length + array2.length];

        int j = 0;
        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (j == array1.length){
                arr3[i] = array1[j];
                j++;
            } else {

            }
        }
        return arr3;
    }
}
