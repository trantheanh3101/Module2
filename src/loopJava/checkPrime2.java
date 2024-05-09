package loopJava;

import java.util.Scanner;

public class checkPrime2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("fill numbers prime want print: ");
        int numberLimit = scanner.nextInt();

        int N = 2;

        System.out.println("number prime < " + numberLimit + " is: ");
        while (N < numberLimit){
            if (checkprime(N)) {
                System.out.print(N + " ");
                N++;
            }
            N++;
        }
    }
    public static boolean checkprime(int number){
        if (number < 2) return false;

        if (number < 4) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
