package mvc.views;

import mvc.models.Student;
import mvc.repositories.StudentRepository;

import java.util.Scanner;

public class StudentView implements Iview {
    private StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
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

    public int deleteStudent() {
        System.out.print("Student want to delete have ID: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        return idDelete;
    }

    public void dispalyAllStudents(Student[] students) {
        System.out.println("List of all students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("ID: " + student.getCode() + ", Name: " + student.getName() + ", Address: " + student.getAddress() + ", Class: " + student.getClassroom());
            }
        }
    }

    public void viewMessageAdd(boolean result) {
        if(result) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }


    public void viewMessageDelete(boolean result) {
        if (result){
            System.out.println(" delete thành công");
        } else {
            System.out.println("Không tìm thấy phần tử cần xóa: ");
        }
    }

    public int getEditStudentId() {
        System.out.print("ID of the student you want to edit: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Student viewEdit(Student student) {
        System.out.println("Editing student with ID: " + student.getCode());

        System.out.print("Input new name (current: " + student.getName() + "): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            student.setName(name);
        }

        System.out.print("Input new address (current: " + student.getAddress() + "): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) {
            student.setAddress(address);
        }

        System.out.print("Input new classroom (current: " + student.getClassroom() + "): ");
        String classroom = scanner.nextLine();
        if (!classroom.isEmpty()) {
            student.setClassroom(classroom);
        }

        return student;
    }

    public void viewMessageEdit(boolean result) {
        if (result) {
            System.out.println("Chỉnh sửa thành công");
        } else {
            System.out.println("Chỉnh sửa thất bại");
        }
    }
}
