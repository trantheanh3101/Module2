package arrayJava;

import java.util.Scanner;

public class demoArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt(); // nhap tay
                matrix[row][column] = (int) (Math.random() * 100);  // random
                total += matrix[row][column];
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("total = " + total);
    }
}
