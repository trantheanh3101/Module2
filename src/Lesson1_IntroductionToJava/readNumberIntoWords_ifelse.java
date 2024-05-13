package Lesson1_IntroductionToJava;

import java.util.Scanner;

public class readNumberIntoWords_ifelse {

    // Bước 2: đọc các số có một chữ số  -->> tạo array words < 10 vaf < 20
    public static String[] ones = {"","one","two","three","four","five","six","seven","eight","nine"};
    public static String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static String[] ten = {"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};


    public static void main(String[] args) {
        // Bước 1: viết mã để chương trình hỏi số cần đọc
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("fill number ");
            number = scanner.nextInt();
        } while (number < 0);

        String words = convert(number);
        System.out.println("words of " + number + " is: " + words);
    }

    public static String convert(int number){
        String result = "";
        if (number < 10) {
            result += ones[number];
        } else if (number < 20) {
            result += ten[number % 10];
        } else if (number < 100) {
            result += tens[number / 10] + " " + ones[number % 10];
        } else {
            result += ones[number / 100] + " hundred " + tens[(number % 100) / 10] + " " + ones[number % 10];
        }
        return result;
    }
}
