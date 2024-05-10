package array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class deleteitem_arraynew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            System.out.print("item " + i + " :");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("value item want delete: ");
        int numDel = sc.nextInt();

        System.out.println("array After check position numDel: ");
        int[] arrNew =  delete(numDel,array);
        arrNew[2] = 50;
        System.out.println(Arrays.toString(arrNew));
        System.out.println(Arrays.toString(array));

    }

    public static int[] delete(int num,int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }

        int[] arrNew = new  int[arr.length-count];
        int j = 0;     // index trong arrNew

        if (count!=0){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != num){
                    arrNew[j] = arr[i];
                    j++;
                }
            }
        }
        return arrNew;
    }
}
