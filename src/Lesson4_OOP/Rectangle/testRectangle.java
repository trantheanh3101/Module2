package Lesson4_OOP.Rectangle;

import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("fill width: ");
            double width = sc.nextDouble();

            System.out.print("fill height: ");
            double height = sc.nextDouble();

            Rectangle rectangle = new Rectangle(width,height);

            System.out.print("Area of Rectangle: " + rectangle.getArea() + "\n");
            System.out.print("Perimeter of Rectangle: " + rectangle.getPerimeter());
        }
    }
