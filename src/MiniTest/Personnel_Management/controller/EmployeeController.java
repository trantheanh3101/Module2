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
        String code ;
        double salaryEmployee;
        Employee employee ;
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
                    code = viewEmployee.getCodeEmployee();
                    salaryEmployee = employeeServices.getSalaryEmployee(code);
                    viewEmployee.getSalaryEmployee(salaryEmployee);
                    break;
                case 5:
                    employees = employeeServices.getAllEmployees();
                    double averageSalary =  employeeServices.getAverageSalaryAllEmployee(employees);
                    viewEmployee.getAverageSalaryEmployee(averageSalary);
                    break;
                case 6:
                    employees = employeeServices.getAllEmployees();
                    Employee[] listEmployeeAlittleSalaries = employeeServices.getEmployeeAlittleSalary(employees);
                    viewEmployee.listEmployeeAlittleSalaries(listEmployeeAlittleSalaries);
                    break;
                case 7:
                    employees = employeeServices.getAllEmployees();
                    double totalMoney = employeeServices.getTotalSalaryPartTimeEmployee(employees);
                    viewEmployee.getTotalMoneyPartTimeEmployee(totalMoney);
                    break;
                case 0:
                    return;
            }
        }
    }
}
