package Lesson6_Inheritance.Shape;

import java.util.Scanner;

public class checkTriangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println("Triangle defaul:\n" + triangle);
        System.out.println(" ");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameters of the triangle: ");
        System.out.print("fill side1 : ");
        double side1 = scanner.nextDouble();
        System.out.print("fill side2 : ");
        double side2 = scanner.nextDouble();
        System.out.print("fill side3 : ");
        double side3 = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ ký tự newline từ dòng trước
        System.out.print("choose color: ");
        String colorTri = scanner.nextLine();
        System.out.print("isfilled color: ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle1 = new Triangle(colorTri,filled,side1,side2,side3);

        if (isTriangle(side1,side2,side3)){
            System.out.println("Shape is a Triangle");
            System.out.println(triangle1);
        } else {
            System.out.print("Shape is not Triangle");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        // Kiểm tra các điều kiện của tam giác   a + b > c , b + c > a , a + c > b , a,b,c > 0
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            return false;
        }
        return true;
    }
}
