package array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class find_item_max_array_2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valueMax;

        System.out.print("fill row: ");
        int row = sc.nextInt();

        System.out.print("fill col: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random()*100) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array));

        valueMax = itemMax(array);
        System.out.println("value max on array is : " + valueMax);

        int[] pos = possition(valueMax,array);
        System.out.println("position of valueMax: array[" +pos[0] + "][" + pos[1] + "]" );
    }

    public static int itemMax(int[][] arr){
        int max = 0;
        for (int[] row : arr){
            for (int item : row){
                if (item > max ) max = item;
            }
        }
        return max;
    }

    public static int[] possition(int num,int[][] arr){
        int[] array = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
}
