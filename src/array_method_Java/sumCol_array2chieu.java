package array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class sumCol_array2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.print("colum want cal sum: ");
        int numCol = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < col; i++) {
            sum += array[i][numCol-1];
        }
        System.out.println("Sum of colum " + numCol + " = " + sum );
    }
}
