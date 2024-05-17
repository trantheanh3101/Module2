package testmvc;

// StudentController.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    public StudentController(StudentView view) {
        this.students = new ArrayList<>();
        this.view = view;
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        students.add(new Student(id, name, email));
    }

    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to edit: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new email: ");
                student.setEmail(scanner.nextLine());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        students.removeIf(student -> student.getId().equals(id));
    }

    public void displayAllStudents() {
        view.printAllStudents(students);
    }

    public void run() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 0:
                    System.out.println("Ending program.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

