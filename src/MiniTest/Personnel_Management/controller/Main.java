package MiniTest.Personnel_Management.controller;

import MiniTest.Personnel_Management.services.EmployeeServices;
import MiniTest.Personnel_Management.view.View;
import MiniTest.Personnel_Management.view.ViewEmployee;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ViewEmployee viewEmployee = new ViewEmployee();
        EmployeeServices employeeServices = new EmployeeServices();
        EmployeeController employeeController = new EmployeeController(viewEmployee,employeeServices);

        int option = view.view();
        switch (option){
            case 1:
                employeeController.run();
                break;
            case 2:
                break;
            case 0:
                return;
        }

    }
}
