package Lesson19_String.demo;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("Hello");
        for (int i = 0; i < 5; i++) {
            result.append(" World");
        }
        System.out.println(result.toString());
    }
}

