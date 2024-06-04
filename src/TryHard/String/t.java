package TryHard.String;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("nhap String: ");
        String string = s.nextLine();
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String str){
        String[] strings = str.split("");
        for (int i = 0; i < str.length()/2; i++) {
            if (!strings[i].equals(strings[strings.length-1-i]))
                return false;
        }
        return true;
    }
}
