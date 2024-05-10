package array_method_Java;

import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("fill string ");
        String string = sc.nextLine();

        int num = string.length();

        System.out.println("ki tu can tim");
        char x = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < num; i++) {
            if (x == string.charAt(i)){
                count++;
            }
        }
        System.out.println("value char have : " + count);
    }
}
