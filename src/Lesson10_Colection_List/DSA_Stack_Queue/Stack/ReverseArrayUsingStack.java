package Lesson10_Colection_List.DSA_Stack_Queue.Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static int[] reverseArrayUsingStack(int[] array) {
        // Khởi tạo stack rỗng
        Stack<Integer> stack = new Stack<>();

        // Duyệt qua mảng và đưa từng phần tử vào stack
        for (int element : array) {
            stack.push(element);
        }

        // Lấy phần tử từ stack và đưa vào mảng theo thứ tự ngược lại
        int i = 0;
        while (!stack.isEmpty()) {
            array[i] = stack.pop();
            i++;
        }

        // Trả về mảng đã được đảo ngược
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 9, 4, 3};
        System.out.println("Mảng gốc: " + Arrays.toString(array));
        System.out.println("dung array ");
        int[] reversedArray = reverseArrayUsingStack(array);
        System.out.println("Mảng đã được đảo ngược: " + Arrays.toString(reversedArray));
    }
}

