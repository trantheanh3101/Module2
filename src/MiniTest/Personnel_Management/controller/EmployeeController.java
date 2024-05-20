package MiniTest.Personnel_Management.controller;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.services.EmployeeServices;
import MiniTest.Personnel_Management.view.ViewEmployee;

public class EmployeeController {
    private static ViewEmployee viewEmployee;
    private static EmployeeServices employeeServices;

    public EmployeeController(ViewEmployee viewEmployee, EmployeeServices employeeServices) {
        this.viewEmployee = viewEmployee;
        this.employeeServices = employeeServices;
    }

    public static void run() {
        int option;
        boolean result;
        Employee employee;
        Employee[] employees;
        while (true){
            option = viewEmployee.view();
            switch (option){
                case 1:
                    employee = viewEmployee.viewAddPartTimeEmployee();
                    result = employeeServices.add(employee);
                    viewEmployee.getMess(result);
                    break;
                case 2:
                    employee = viewEmployee.viewAddFullTimeEmployee();
                    result = employeeServices.add(employee);
                    viewEmployee.getMess(result);
                    break;
                case 3:
                    employees = employeeServices.getAllEmployees();
                    viewEmployee.displayAllEmployees(employees);
                    break;
                case 4:
                    employee = viewEmployee.viewSalyryEmployee();
                    employeeServices.calSalaryEmployee(employee);
                    break;
                case 5:
                    break;
                case 0:
                    return;
            }
        }
    }
}
