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
        Employee employee;
        for (int i = 0; i < inforEmployee.getCountStu(); i++) {
            employee = inforEmployee.getEmployees()[i];
            if (employee.getCode().equals(code))
                if (employee instanceof PartTimeEmployee)
                    result = ((PartTimeEmployee) employee).getSalaryEmployee();
                else
                    result = ((FullTimeEmployee) employee).getSalaryEmployee();
        }
        return result;
    }

    public double getAverageSalaryAllEmployee(Employee[] employees) {
        double sumSalary = 0;
        int count = inforEmployee.getCountStu();
        for (int i = 0 ; i < count - 1;i++){
            if (employees[i] instanceof PartTimeEmployee)
                sumSalary += ((PartTimeEmployee) employees[i]).getSalaryEmployee();
            else
                sumSalary += ((FullTimeEmployee) employees[i]).getSalaryEmployee();

        }
        return sumSalary/count;
    }


    public Employee[] getEmployeeAlittleSalary(Employee[] employees) {
        int countEmSalary = 0;
        int count = employees.length;
        double averageSalaryAllEmployee = getAverageSalaryAllEmployee(employees);

        Employee[] employeesSalary = new Employee[count];

        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof PartTimeEmployee) {
                if (((PartTimeEmployee) employees[i]).getSalaryEmployee() < averageSalaryAllEmployee) {
                    employeesSalary[countEmSalary] = employees[i];
                    countEmSalary++;
                }
            } else if (employees[i] instanceof FullTimeEmployee) {
                if (((FullTimeEmployee) employees[i]).getSalaryEmployee() < averageSalaryAllEmployee) {
                    employeesSalary[countEmSalary] = employees[i];
                    countEmSalary++;
                }
            }
        }

        Employee[] result = new Employee[countEmSalary];
        System.arraycopy(employeesSalary, 0, result, 0, countEmSalary);

        return result;
    }

    public double getTotalSalaryPartTimeEmployee(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees){
            if (employee instanceof PartTimeEmployee)
                total += ((PartTimeEmployee) employee).getSalaryEmployee();
        }
        return total;
    }
}
