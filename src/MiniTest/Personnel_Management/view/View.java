package MiniTest.Personnel_Management.view;

import java.util.Scanner;

public class View {
    public static int view() {
        System.out.println("--------View--------");
        System.out.println("1. Employee ");
        System.out.println("2. Manager ");
        System.out.println("0. Exit ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
