package Lesson2_LoopJava;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("fill numbers prime want print: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        System.out.println(numbers + " number prime first is : ");
        while (count < numbers){
            if (checkprime(N)) {
                count++;
                System.out.print(N + " ");
                N++;
            }
            N++;
        }
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
