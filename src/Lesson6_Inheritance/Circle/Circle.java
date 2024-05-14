package Lesson6_Inheritance.Circle;

//         ______________________________________
//        |        Circle                        |
//        |--------------------------------------|
//        | - radius : double private            |
//        | - color : String private             /
//        |--------------------------------------|
//        \ - Circle()                           \
//        \ - Circle(radius,color)               \
//        |--------------------------------------|
//        | + getter()                           |
//        | + setter()                           |
//        | + getArea() : double                 |
//        | + getPerimeter() : double            |
//        | + toString() : String                |
//        ---------------------------------------

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + " radius= " + radius
                + ", color = '" + color + '\'' + '}';
    }
}
