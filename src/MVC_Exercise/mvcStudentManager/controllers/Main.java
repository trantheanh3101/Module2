package MVC_Exercise.mvcStudentManager.controllers;

import MVC_Exercise.mvcStudentManager.services.IStudentService;
import MVC_Exercise.mvcStudentManager.services.impl.StudentService;
import MVC_Exercise.mvcStudentManager.views.StudentView;
import MVC_Exercise.mvcStudentManager.views.UserView;


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
