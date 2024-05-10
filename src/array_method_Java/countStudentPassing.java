package array_method_Java;

import java.util.Scanner;

public class countStudentPassing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("fill number student <= 30 student " + "\n" + "n = ");
            n =  sc.nextInt();
        } while (n > 30);

        int[] pointStudent = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("point of student " + i + " : ");
            do {
                pointStudent[i] = sc.nextInt();
                if (pointStudent[i] > 10 || pointStudent[i] < 0) {
                    System.out.println(" 0 <= point <= 10 , fill again");
                    System.out.print("point of student " + i + " : ");
                }
            } while (pointStudent[i] > 10 || pointStudent[i] < 0);
        }

        System.out.println("The number of students passing the exam : " + checkPass(pointStudent));
    }

    public static int checkPass(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 ) count++;
        }
        return count;
    }
}
