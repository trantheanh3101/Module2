package TryHard.JavaBasic;

import java.util.Scanner;

public class Ex4_prime_in_Fibonacies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("numberLimit: ");
        int N = sc.nextInt();

        System.out.println("cac so nguyen to trong day fibonary < " + N + " : " );
        int i = 0;
        while (fibonacci(i) < 100) {
            int fi = fibonacci(i);
            if (isPrimeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
    }

    public static int fibonacci(int n){
        if (n < 0) return -1;
        else if (n < 2 ) return n;
        else {
            return fibonacci(n - 1 ) + fibonacci(n - 2);
        }
    }

    public static boolean isPrimeNumber(int n){
        if (n < 2) return false;

        if (n < 4) return true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
