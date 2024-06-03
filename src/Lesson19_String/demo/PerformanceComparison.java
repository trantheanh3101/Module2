package Lesson19_String.demo;

public class PerformanceComparison {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String
        startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str += " World";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + "ms");
    }
}

