package TryHard.JavaBasic;

import java.util.Scanner;

public class Ex5_isLeepYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap nam muon kiem tra nam nhuan: ");
        int year = scanner.nextInt();
        if (checkYear(year)){
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " ko la nam nhuan");
        }
    }

    private static boolean checkYear(int year) {
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0) {
                    return true;
                } else return false;
            else return true;
        else return false;
    }
}
