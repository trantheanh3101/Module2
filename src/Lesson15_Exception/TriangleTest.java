package Lesson15_Exception;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất của tam giác: ");
            double side1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Nhập cạnh thứ hai của tam giác: ");
            double side2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Nhập cạnh thứ ba của tam giác: ");
            double side3 = Double.parseDouble(scanner.nextLine());

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }  catch (NumberFormatException e) {
            System.err.println("Lỗi: Giá trị nhập vào phải là số.");
        } catch (Exception e) {
            System.err.println("Lỗi không xác định: " + e.getMessage());
        }
        scanner.close();
    }
}
