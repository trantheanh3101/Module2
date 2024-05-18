package mvc.views;

import mvc.models.Student;
import mvc.repositories.StudentRepository;

import java.util.Scanner;

public class StudentView implements Iview {
    private StudentRepository studentRepository = new StudentRepository();

    public int view() {
        System.out.println("--------Student View--------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Display all student");
        System.out.println("0. End program");
        System.out.print("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public Student viewAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.println("Input classroom: ");
        String classroom = scanner.nextLine();
        Student student = new Student(code, name, address, classroom);
        return student;
    }

    public void dispalyAllStudents(Student[] students) {
        System.out.println("List of all students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("ID: " + student.getCode() + ", Name: " + student.getName() + ", Address: " + student.getAddress() + ", Class: " + student.getClassroom());
            }
        }
    }

    public void viewMessage(boolean result) {
        if(result) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }
}
