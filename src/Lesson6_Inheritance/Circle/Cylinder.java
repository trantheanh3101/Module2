package Lesson6_Inheritance.Circle;

//         ______________________________________
//        |        Cylinder                      |
//        |--------------------------------------|
//        | - height : double private            |
//        |--------------------------------------|
//        \ - Cylinder()                         \
//        \ - Cylinder(height)                   \
//        \ - Cylinder(radius,color,height)      \
//        |--------------------------------------|
//        | + getter()                           |
//        | + setter()                           |
//        | + getArea() : double                 |
//        | + getPerimeter() : double            |
//        | + getVolume() : double               |
//        | + toString() : String                |
//        ---------------------------------------

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        this.height = 5.6;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public double getSurfaceArea() {
        return 2 * super.getArea() + getPerimeter() * height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{ "
                + super.toString()
                + " height = " + height +
                '}';
    }
}
