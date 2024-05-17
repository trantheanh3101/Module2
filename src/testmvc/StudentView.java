package testmvc;

// StudentView.java
import java.util.List;
import java.util.Scanner;

public class StudentView {
    public int showMenu() {
        System.out.println("--------Student View--------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Display all students");
        System.out.println("0. End program");
        System.out.print("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public void printStudentDetails(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
    }

    public void printAllStudents(List<Student> students) {
        for (Student student : students) {
            printStudentDetails(student);
            System.out.println("-------------");
        }
    }
}

