package array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class sum_mainDiagonal_matrix2 {
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

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("total all value main diagonal : Total = " + sum);
    }
}
