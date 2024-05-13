package Lesson1_IntroductionToJava;

import java.util.Scanner;

public class transferMoney {
    public static void main(String[] args) {

        float rate = 23000f;
        float usd;

        Scanner scanner = new Scanner(System.in);

        System.out.println("fill usd transfer: ");
        usd = scanner.nextFloat();

        float vnd = usd * rate ;
        System.out.println("VND : " + vnd);
    }
}
