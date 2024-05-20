package MiniTest.Personnel_Management.services;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.model.FullTimeEmployee;
import MiniTest.Personnel_Management.model.PartTimeEmployee;
import MiniTest.Personnel_Management.reprositories.InforEmployee;

public class EmployeeServices {
    private InforEmployee inforEmployee = new InforEmployee();

    public boolean add(Employee employee) {
        if(employee.getName().equals("")) {
            return false;
        }

        inforEmployee.add(employee);
        return true;
    }

    public Employee[] getAllEmployees() {
        return inforEmployee.getEmployees();
    }

    public double getSalaryEmployee(String code) {
        double result = 0;
        String codeEmployee ;
        Employee employee;
        for (int i = 0; i < inforEmployee.getCountStu(); i++) {
            employee = inforEmployee.getEmployees()[i];
            if (employee.getCode().equals(code))
                if (employee instanceof PartTimeEmployee)
                    result = ((PartTimeEmployee) employee).getSalaryEmployee(employee);
                else
                    result = ((FullTimeEmployee) employee).getSalaryEmployee(employee);
        }
        return result;
    }
}
