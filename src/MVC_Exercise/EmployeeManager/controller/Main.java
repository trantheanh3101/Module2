package MVC_Exercise.EmployeeManager.controller;

import MVC_Exercise.EmployeeManager.view.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(view);
        employeeController.run();
    }
}
