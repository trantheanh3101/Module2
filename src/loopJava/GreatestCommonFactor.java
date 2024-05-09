package loopJava;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("fill number a: ");
        int a = scanner.nextInt();

        System.out.println("fill number b: ");
        int b = scanner.nextInt();

        System.out.println("UCLN is : " + findMax(a,b));
    }
// caách 1 : dùng a - b (a > b)
//    public static int findMax(int a, int b){
//        int ucln = 0;
//        a = Math.abs(a);
//        b = Math.abs(b);
//        if (a == 0 || b == 0) {
//            System.out.println("No greatest common factor");
//        }
//        while (a != b) {
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//        return ucln = a;
//    }


    // cách 2: bằng giải thuật Euclid

    public static int findMax(int a, int b) {
        // Nếu một trong hai số bằng 0, ước chung lớn nhất là số còn lại
        if (b == 0) {
            return a;
        } else {
            // Đệ quy: GCD của a và b là GCD của b và a % b
            return findMax(b, a % b);
        }
    }
}
