package Lesson6_Inheritance.Circle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println(" ");

        Circle circle1 = new Circle(5.0,"Blue");
        System.out.println(circle1);
        System.out.println("Area = " + circle1.getArea());
        System.out.println("Perimeter = " + circle1.getPerimeter());
        System.out.println(" ");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Surface Area = " + cylinder.getSurfaceArea());
        System.out.println("Perineter = " + cylinder.getPerimeter());
        System.out.println("Volume = " + cylinder.getVolume());
        System.out.println(" ");

        Cylinder cylinder1 = new Cylinder(56);
        System.out.println(cylinder1);
        System.out.println("Surface Area = " + cylinder1.getSurfaceArea());
        System.out.println("Perineter = " + cylinder1.getPerimeter());
        System.out.println("Volume = " + cylinder1.getVolume());
        System.out.println(" ");

        Cylinder cylinder2 = new Cylinder(10,"red",0.56);
        System.out.println(cylinder2);
        System.out.println("Surface Area = " + cylinder2.getSurfaceArea());
        System.out.println("Perineter = " + cylinder2.getPerimeter());
        System.out.println("Volume = " + cylinder2.getVolume());
    }
}
