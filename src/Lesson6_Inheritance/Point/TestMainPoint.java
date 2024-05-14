package Lesson6_Inheritance.Point;

public class TestMainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(2.5f,3.5f);
        System.out.println(point2D1);
        point2D1 = new Point2D(4,6);
        System.out.println("new : " + point2D1);
        System.out.println(" ");

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(6);
        point3D.setX(15);
        point3D.setY(30);
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(6.5f,7.9f,6.5f);
        System.out.println(point3D1);


        MovablePoint movablePoint = new MovablePoint(0,0,1,2);
        System.out.println("before move: ");
        System.out.println(movablePoint);
        System.out.println("after move 3 time: ");
        movablePoint.move().move().move();
        System.out.println(movablePoint);
    }
}
