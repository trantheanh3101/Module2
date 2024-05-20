package MiniTest.Personnel_Management.reprositories;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.model.FullTimeEmployee;
import MiniTest.Personnel_Management.model.PartTimeEmployee;

public class InforEmployee {
    public static Employee[] employees = new Employee[100];
    static int count = 0;

    static {
        employees[0] = new FullTimeEmployee("theanh","FT1",20,"0857157116","trantheanhk11@gmail.com",100000000,100000,50000);
        employees[1] = new PartTimeEmployee("theanh1","PT1",25,"08571544545","theanhk11@gmail.com",50);
        count = 2;
    }

    public static void add(Employee employee){
        employees[count] = employee;
        count++;
    }

    public int getCountStu() {
        return count;
    }

    public int getCapacity() {
        return employees.length;
    }

    public Employee[] getEmployees() {
        Employee[] employeesNew = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employeesNew[i] = employees[i];
        }
        return employeesNew;
    }

}
