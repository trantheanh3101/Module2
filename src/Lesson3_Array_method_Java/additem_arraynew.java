package Lesson3_Array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class additem_arraynew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            System.out.print("item " + i + " :");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("index item want add: ");
        int index = sc.nextInt();

        System.out.print("value item want add: ");
        int numAdd = sc.nextInt();

        System.out.println("array After check position numAdd: ");
        int[] arrNew =  add(index,numAdd,array);
//        arrNew[2] = 50;
        System.out.println(Arrays.toString(arrNew));
        System.out.println(Arrays.toString(array));

    }

    public static int[] add(int index,int num,int[] arr){
        int[] arrNew = new  int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == i ){
                arrNew[index] = num;
                j++;
                arrNew[j] = arr[i];
                j++;
            } else {
                arrNew[j] = arr[i];
                j++;
            }
        }
        return arrNew;
    }
}
