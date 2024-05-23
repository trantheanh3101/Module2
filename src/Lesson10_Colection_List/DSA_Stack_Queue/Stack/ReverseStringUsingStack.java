package Lesson10_Colection_List.DSA_Stack_Queue.Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseStringUsingStack(String inputString) {
        // Khởi tạo Stack rỗng
        Stack<String> stack = new Stack<>();

        // Duyệt qua chuỗi và đưa từng từ vào Stack
        for (String word : inputString.split(" ")) {
            stack.push(word);
        }

        // Lấy từng từ từ Stack và nối vào chuỗi mới
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            String word = stack.pop();
            reversedString.append(word).append(" ");
        }

        // Loại bỏ khoảng trắng thừa ở cuối chuỗi
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String inputString = "Xin chào thế giới!";
        String reversedString = reverseStringUsingStack(inputString);
        System.out.println("Chuỗi gốc: " + inputString);
        System.out.println("Chuỗi đã được đảo ngược: " + reversedString);
    }
}
