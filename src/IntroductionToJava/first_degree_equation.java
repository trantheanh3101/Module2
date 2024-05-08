package IntroductionToJava;

import java.util.Scanner;

public class first_degree_equation {
    public static void main(String[] args) {

        System.out.println(" giải phuương trình bậc nhất   ax + b = c :");

        Scanner sc = new Scanner(System.in);

        System.out.println("number a: ");
        float a = sc.nextFloat();

        System.out.println("number b: ");
        float b = sc.nextFloat();

        System.out.println("number c: ");
        float c = sc.nextFloat();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = " +  answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
        sc.close();
    }
}
