package loopJava;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("fill n: ");
        int n = scanner.nextInt();


        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }

        System.out.printf("sum = %.2f" , sum);
    }
}
