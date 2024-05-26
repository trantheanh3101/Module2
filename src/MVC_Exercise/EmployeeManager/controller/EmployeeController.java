package MVC_Exercise.EmployeeManager.controller;

import MVC_Exercise.EmployeeManager.serveces.EmployeeServeces;
import MVC_Exercise.EmployeeManager.view.EmployeeView;

public class EmployeeController {
    private EmployeeView employeeView;
    private EmployeeServeces employeeServeces;

    public EmployeeController(EmployeeView employeeView) {
        this.employeeServeces = new EmployeeServeces();
        this.employeeView = employeeView;
    }

    public void run() {
        boolean exit = false;
        while(!exit) {
            int choise = employeeView.getMenuChoise();
            switch (choise) {
                case 1:
                    int options = employeeView.getEmployeeChoise();
                    switch (options){
                        case 1:
                            employeeServeces.addWorker(employeeView);
                            break;
                        case 2:
                            employeeServeces.addEnginner(employeeView);
                            break;
                        case 3:
                            employeeServeces.addStaff(employeeView);
                            break;
                        case 4:
                            break;
                        default:
                            employeeView.getMessenger();
                            break;
                    }
                    break;
                case 2:
                    employeeServeces.searchEmployeeByName(employeeView);
                    break;
                case 3:
                    employeeServeces.displayEmployee(employeeView);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    employeeView.getMessenger();
                    break;
            }
        }
    }
}
