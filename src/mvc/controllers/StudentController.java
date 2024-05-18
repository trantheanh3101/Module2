package mvc.controllers;

import mvc.models.Student;
import mvc.services.IStudentService;
import mvc.services.impl.StudentService;
import mvc.views.StudentView;
import mvc.views.UserView;

public class StudentController {
    private StudentView studentView;
    private IStudentService studentService;

    public StudentController(StudentView studentView, IStudentService studentService) {
        this.studentView = studentView;
        this.studentService = studentService;
    }

    public void run() {
        int choice;
        Student student;
        boolean result;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = studentService.add(student);
                    studentView.viewMessage(result);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    Student[] students = studentService.getAllStudents();
                    studentView.dispalyAllStudents(students);
                    break;
                }
                case 0:
                    return;
            }
        }
    }
}
