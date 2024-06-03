package Lesson19_String.demo;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer("Hello");
        for (int i = 0; i < 5; i++) {
            result.append(" World");
        }
        System.out.println(result.toString());

    }
}

