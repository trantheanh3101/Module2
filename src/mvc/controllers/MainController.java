package mvc.controllers;

import mvc.models.Student;
import mvc.services.IStudentService;
import mvc.services.impl.StudentService;
import mvc.views.StudentView;

public class MainController {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();
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
                case 0:
                    return;
            }
        }
    }
}
