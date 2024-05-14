package Lesson6_Inheritance.Shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape);

        shape = new Shape("blue",true);  // ghi đè , ko phai biến new
        System.out.println(shape);

        Shape shape1 = new Shape();   // new bien
        System.out.println(shape1);

        // Circle
        Circle circle = new Circle();
        System.out.println(circle);
        Shape c1 = new Circle();   // kieu du lieu Shape , lop cha cua Circle
        System.out.println(c1);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false,3.5);
        System.out.println(circle);

        // Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
