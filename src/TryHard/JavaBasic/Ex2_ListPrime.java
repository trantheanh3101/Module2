package TryHard.JavaBasic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_ListPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("moc N : ");
        int N = scanner.nextInt();
        ArrayList<Integer> listPrime = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (checkPrime(i))
                listPrime.add(i);
        }

        System.out.println("List number Prime < N : " + listPrime);
    }

    public static boolean checkPrime(int number){
        if (number < 2) return false;

        if (number < 4) return true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
