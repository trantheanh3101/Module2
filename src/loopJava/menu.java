package loopJava;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice =-1;
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 15; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        }
    }
}
