package loopJava;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("fill nunmber need check : ");
        int number = scanner.nextInt();

        if (checkprime(number))
            System.out.println(number + " is prime");
        else
            System.out.println(number + " isn't prime");
    }

    public static boolean checkprime(int number){
        if (number<2) return false;
        if (number<4) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
