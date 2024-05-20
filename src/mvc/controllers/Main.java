package mvc.controllers;

import mvc.services.IStudentService;
import mvc.services.impl.StudentService;
import mvc.views.StudentView;
import mvc.views.UserView;


public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView();
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();
        StudentController studentController = new StudentController(studentView, studentService);

        int option = userView.view();
        switch (option){
            case 1:
                studentController.run();
                break;
            case 2:
                break;
            case 0:
                return;
        }
    }
}
