package Lesson1_IntroductionToJava;

import java.util.Scanner;

public class readNumberIntoWords_switchcase {

    public static void main(String[] args) {
        // Bước 1: viết mã để chương trình hỏi số cần đọc
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("fill number ");
            number = scanner.nextInt();
        } while (number < 0);

        String words = convert(number);
        System.out.println("words of number " + number + " is: " + words);
    }


    public static String convert(int number){
        String result = "";
        int one = number%10;
        int ten = number / 10;
        int hundred = number / 100;

        switch (hundred){
            case 0:
                result += "";
            case 1:
                result += "one hundred ";
                break;
            case 2:
                result += "two hundred ";
                break;
            case 3:
                result += "three hundred ";
                break;
            case 4:
                result += "four hundred ";
                break;
            case 5:
                result += "five hundred ";
                break;
            case 6:
                result += "six hundred ";
                break;
            case 7:
                result += "seven hundred ";
                break;
            case 8:
                result += "eight hundred ";
                break;
            case 9:
                result += "nine hundred ";
                break;
        }

        switch (ten){
            case 0:
                result += "ten";
                break;
            case 1:
                result += "eleven";
                break;
            case 2:
                result += "twelve";
                break;
            case 3:
                result += "thirteen";
                break;
            case 4:
                result += "fourteen";
                break;
            case 5:
                result += "fifteen";
                break;
            case 6:
                result += "sixteen";
                break;
            case 7:
                result += "seventeen";
                break;
            case 8:
                result += "eighteen";
                break;
            case 9:
                break;
        }

        switch (one){
            case 0:
                result += "zezo";
            case 1:
                result += "one";
                break;
            case 2:
                result += "two";
                break;
            case 3:
                result += "three";
                break;
            case 4:
                result += "four";
                break;
            case 5:
                result += "five";
                break;
            case 6:
                result += "six";
                break;
            case 7:
                result += "seven";
                break;
            case 8:
                result += "eight";
                break;
            case 9:
                result += "nine";
                break;
        }
        return result;
    }
}
