package loopJava;

import java.util.Arrays;

public class demoLoop {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 4, 5, 3};

        // for
        int leftSum = 0;
        int element = 0;
        for (int i = 1; i < arr.length; i++) {
            leftSum += arr[i-1];
            int rightSum = 0;
            for (int j = i+1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum){
                element = i;
                break;
            }
        }

        if (element != 0){
            System.out.println("Array good");
        } else {
            System.out.println("Array not good");
        }

        System.out.println("Array before:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after:");
        for (int i = 0; i < arr.length; i++) {
            if (element == i) {
                System.out.println();
                i++;
            }
            System.out.print(arr[i] + " ");
        }

//        while
//        int leftSum = 0;
//        int element = 0;
//        int i = 1;
//        int j = i+1;
//        int rightSum = 0;
//
//        while(i < arr.length){
//            if (j < arr.length){
//                rightSum += arr[j];
//                j++;
//                continue;
//            }
//            leftSum += arr[i-1];
//            if (leftSum == rightSum) {
//                element = i;
//                break;
//            } else {
//                i++;
//                rightSum = 0;
//                j = i +1;
//            }
//        }
//        if (element != 0){
//            System.out.println("Array good");
//        } else {
//            System.out.println("Array not good");
//        }
//
//        System.out.println("Array before:");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Array after:");
//        for (int k = 0; k < arr.length; k++) {
//            if (element == k) {
//                System.out.println();
//                k++;
//            }
//            System.out.print(arr[k] + " ");
//        }

        // do-while
//        int leftSum = 0;
//        int element = 0;
//        int i = 1;
//        int j = i+1;
//        int rightSum = 0;
//        do {
//            if (j < arr.length){
//                rightSum += arr[j];
//                j++;
//                continue;
//            }
//            leftSum += arr[i-1];
//            if (leftSum == rightSum) {
//                element = i;
//                break;
//            } else {
//                i++;
//                rightSum = 0;
//                j = i + 1;
//            }
//        } while (i < arr.length);
////
//        if (element != 0){
//            System.out.println("Array good");
//        } else {
//            System.out.println("Array not good");
//        }
//        System.out.println("Array before:");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Array after:");
//        for (int k = 0; k < arr.length; k++) {
//            if (element == k) {
//                System.out.println();
//                k++;
//            }
//            System.out.print(arr[k] + " ");
//        }
    }
}
