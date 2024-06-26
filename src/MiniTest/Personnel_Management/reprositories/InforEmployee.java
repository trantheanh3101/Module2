package MiniTest.Personnel_Management.reprositories;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.model.FullTimeEmployee;
import MiniTest.Personnel_Management.model.PartTimeEmployee;

public class InforEmployee {
    public static Employee[] employees = new Employee[100];
    static int count = 0;

    static {
        employees[0] = new FullTimeEmployee("theanh","FT1",20,"0857157116","trantheanhk11@gmail.com",1000,100,50);
        employees[1] = new FullTimeEmployee("theanh","FT2",20,"085715711","trgantheanhk11@gmail.com",2000,200,20);
        employees[2] = new PartTimeEmployee("theanh1","PT1",25,"08571544545","theanhk11@gmail.com",50);
        employees[3] = new PartTimeEmployee("the","PT2",26,"08544545","theanhk1gfd1@gmail.com",5);
        count = 4;
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
