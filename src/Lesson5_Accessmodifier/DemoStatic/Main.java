package Lesson5_Accessmodifier.DemoStatic;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();


        Car car1 = new Car("honda","KIA 1");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("TOyota","toyota 1");
        System.out.println(Car.numberOfCars);
    }
}
