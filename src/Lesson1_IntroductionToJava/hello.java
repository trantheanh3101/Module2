package Lesson1_IntroductionToJava;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Welcome to Java");
        System.out.println("learn java");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Xin chao " + name);
        s.close();
    }
}
