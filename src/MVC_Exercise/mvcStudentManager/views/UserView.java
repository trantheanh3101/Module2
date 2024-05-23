package MVC_Exercise.mvcStudentManager.views;

import java.util.Scanner;

public class UserView implements Iview{

    @Override
    public int view() {
        System.out.println("--------User View--------");
        System.out.println("1. Student ");
        System.out.println("2. Teacher ");
        System.out.println("0. Exit ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
