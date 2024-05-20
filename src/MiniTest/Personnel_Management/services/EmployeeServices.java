package MiniTest.Personnel_Management.services;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.model.FullTimeEmployee;
import MiniTest.Personnel_Management.model.PartTimeEmployee;
import MiniTest.Personnel_Management.reprositories.InforEmployee;
import mvc.models.Student;

public class EmployeeServices implements ReviewSalary {
    private InforEmployee inforEmployee = new InforEmployee();

    @Override
    public double calSalaryEmployee(Employee employee) {
        double result = 0;
        if (employee instanceof FullTimeEmployee){
           return result = ((FullTimeEmployee) employee).getBasicSalary() + (((FullTimeEmployee) employee).getBonusSalary() - ((FullTimeEmployee) employee).getPenaltySalary());
        } else
           return result = ((PartTimeEmployee) employee).getOvertimeHours() * 100000;
    }

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
}
