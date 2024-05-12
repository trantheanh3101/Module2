package OOP.QuadraticEquation;

import java.util.Scanner;

public class testQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("fill a: ");
        double a = sc.nextDouble();
        System.out.print("fill b: ");
        double b = sc.nextDouble();
        System.out.print("fill c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        double delta = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        double x12 = quadraticEquation.getRoot();

        if (a == 0){
            if(b == 0){
                System.out.print("The equation has no roots");
            } else {
                System.out.print("The equation: x = " + -c/b);
            }
            return;
        }
        if (delta > 0) {
            System.out.println("The equation has 2 roots");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0 ){
            System.out.println("The equation has 1 roots");
            System.out.println("x12 = " + x12);
        } else {
            System.out.print("The equation has no roots");
        }
    }
 }
