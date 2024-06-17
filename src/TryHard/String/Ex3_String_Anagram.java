package TryHard.String;

import java.util.Scanner;

public class Ex3_String_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String 1: ");
        String string1 = scanner.nextLine();
        System.out.println("String 2: ");
        String string2 = scanner.nextLine();

        boolean result ;
        result = checkAnagram(string1,string2);

        if (result){
            System.out.println(" Anagram ");
        } else {
            System.out.println(" no anagram");
        }
    }

    public static boolean checkAnagram(String string1,String string2){
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        int length1 = string1.length();
        int length2 = string2.length();
        if (length1 != length2){
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (chars1[0] != chars2[length2-1])
                return false;
        }
        return true;
    }
}
