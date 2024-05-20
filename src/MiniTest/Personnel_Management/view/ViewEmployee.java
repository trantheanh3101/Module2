package MiniTest.Personnel_Management.view;

import MiniTest.Personnel_Management.model.Employee;
import MiniTest.Personnel_Management.model.FullTimeEmployee;
import MiniTest.Personnel_Management.model.PartTimeEmployee;
import MiniTest.Personnel_Management.reprositories.InforEmployee;

import java.util.Scanner;

public class ViewEmployee {
    private InforEmployee inforEmployee = new InforEmployee();
    Scanner scanner = new Scanner(System.in);

    public int view() {
        System.out.println("--------Employee View--------");
        System.out.println("1. Add Employee Part Time");
        System.out.println("2. Add Employee Full Time");
        System.out.println("3. Display all Employee");
        System.out.println("4. Salary Employee ");
        System.out.println("5. Average Salary all Employee");
        System.out.println("0. End program");
        System.out.print("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public Employee viewAddPartTimeEmployee() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("code: ");
        String code = scanner.nextLine();
        System.out.print("phone: ");
        String phone = scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();
        System.out.println("overtimehours");
        int hours = Integer.parseInt(scanner.nextLine());
        Employee employee = new PartTimeEmployee(name,code,age,phone,email,hours);
        return employee;
    }

    public Employee viewAddFullTimeEmployee() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("code: ");
        String code = scanner.nextLine();
        System.out.print("phone: ");
        String phone = scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();
        System.out.println("basicSalary: ");
        double basicSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("bonusSalary: ");
        double bonusSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("basicSalary: ");
        double penaltySalary = Integer.parseInt(scanner.nextLine());
        Employee employee = new FullTimeEmployee(name,code,age,phone,email,basicSalary,bonusSalary,penaltySalary);
        return employee;
    }

    public void getMess(boolean result) {
        if (result){
            System.out.println("add thanh cong");
        } else {
            System.out.println("add that bai");
        }
    }

    public void displayAllEmployees(Employee[] employees) {
        System.out.println("List of all employees: ");
        for (Employee employee : employees){
            if (employee != null) {
                if (employee instanceof PartTimeEmployee)
                    System.out.println("name: "
                            + employee.getName() + " code: "
                            + employee.getCode() + " phone: "
                            + employee.getPhoneNumber() + " age: "
                            + employee.getAge()  + " email: "
                            + employee.getEmail() + " otHours"
                            + ((PartTimeEmployee) employee).getOvertimeHours());
                else System.out.println("name: "
                        + employee.getName() + " code: "
                        + employee.getCode() + " phone: "
                        + employee.getPhoneNumber() + " age: "
                        + employee.getAge()  + " email: "
                        + employee.getEmail() + " basicSalary: "
                        + ((FullTimeEmployee)employee).getBasicSalary() + " bonusSalary: "
                        + ((FullTimeEmployee)employee).getBonusSalary() + " penaltySalary: "
                        + ((FullTimeEmployee)employee).getPenaltySalary());
            }
        }
    }

    public String getCodeEmployee() {
        System.out.println("code employee: ");
        String code = scanner.nextLine();
        return code;
    }


    public void displaySalaryEmployee(double salaryEmployee) {
        System.out.println("salary of employeee salary = " + salaryEmployee);
    }
}
