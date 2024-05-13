package Lesson3_Array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class findItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayStudent;

        System.out.println("fill the number of student: ");
        int numStudent = scanner.nextInt();
        // Tiêu diệt kí tự newline trong buffer
        scanner.nextLine();

        arrayStudent = new  String[numStudent];

        for (int i = 0; i < numStudent; i++) {
            System.out.print("student " + i + ": ");
            arrayStudent[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arrayStudent));

        System.out.print("fill name student want find: ");
        String nameFind = scanner.nextLine();

        System.out.println(checkName(nameFind,arrayStudent));
    }

    public static String checkName(String name,String[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            //  Trong Java, để so sánh nội dung của hai chuỗi,
            //  bạn không thể sử dụng toán tử == mà nên sử dụng phương thức equals() hoặc equalsIgnoreCase().
            if (name.equals(arr[i])){
                result = "Position of the students in the list " + name + " is: " + i;
                break;
            }
            else {
                result = "Not found" + name + " in the list.";
            }
        }
        return result;
    }
}
