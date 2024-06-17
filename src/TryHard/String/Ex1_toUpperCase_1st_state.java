package TryHard.String;

import java.util.Scanner;

public class Ex1_toUpperCase_1st_state {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
        message = sc.nextLine();

        String[] strings = message.trim().split("\\s+");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0,1).toUpperCase() + strings[i].substring(1);
        }

        message = String.join(" ",strings);
        System.out.println(message);

    }
}