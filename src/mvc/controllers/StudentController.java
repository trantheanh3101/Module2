package mvc.controllers;

import mvc.models.Student;
import mvc.services.IStudentService;
import mvc.views.StudentView;

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
        boolean resultAdd;
        Student[] students;
        int idStudent = 0;
        boolean resultDelete;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    resultAdd = studentService.add(student);
                    studentView.viewMessageAdd(resultAdd);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    idStudent = studentView.deleteStudent();
                    resultDelete = studentService.delete(idStudent);
                    studentView.viewMessageDelete(resultDelete);
                    break;
                }
                case 4: {
                    students = studentService.getAllStudents();
                    studentView.dispalyAllStudents(students);
                    break;
                }
                case 0:
                    return ;
            }
        }
    }
}
