package Accessmodifier.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClasss("C05");
        student.setName("Mary");

        System.out.println(student.toString());
    }
}
