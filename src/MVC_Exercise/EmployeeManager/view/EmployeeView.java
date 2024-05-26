package MVC_Exercise.EmployeeManager.view;

import MVC_Exercise.EmployeeManager.model.Employee;
import MVC_Exercise.EmployeeManager.model.Enginner;
import MVC_Exercise.EmployeeManager.model.Staff;
import MVC_Exercise.EmployeeManager.model.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
    Scanner sc = new Scanner(System.in);

    public int getMenuChoise(){
        System.out.println("-------------Employee Menu---------------");
        System.out.println("1.Add Employee");
        System.out.println("2.Search Name Employee");
        System.out.println("3.Display Employee");
        System.out.println("4.Exit programing.");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int getEmployeeChoise() {
        System.out.println("-------------Employee Menu---------------");
        System.out.println("1. Add Worker");
        System.out.println("2. Add Engineer");
        System.out.println("3. Add Staff");
        System.out.println("4. Exit programing.");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void getMessenger() {
        System.out.println("Choise again !!! ");
    }

    public Worker getDetailWorker() {
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter gender : ");
        String gender = sc.nextLine();
        System.out.print("Enter address : ");
        String address = sc.nextLine();
        System.out.print("Enter level : ");
        int level = Integer.parseInt(sc.nextLine());
        return new Worker(name, age, gender, address, level);
    }

    public void getMessengerOK() {
        System.out.println("Thanh cong");
    }

    public Enginner getDetailEnginner() {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter gender : ");
        String gender = sc.nextLine();
        System.out.print("Enter address : ");
        String address = sc.nextLine();
        System.out.println("Enter majors : ");
        String majors = sc.nextLine();
        return new Enginner(name, age, gender, address, majors);
    }

    public Staff getDetailStaff() {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter gender : ");
        String gender = sc.nextLine();
        System.out.print("Enter address : ");
        String address = sc.nextLine();
        System.out.println("Enter majors : ");
        String work = sc.nextLine();
        return new Staff(name, age, gender, address, work);
    }

    public void displayEmployee(ArrayList<Employee> employeeArrayList) {
        if (employeeArrayList.isEmpty()) {
            System.out.println("There are no employees in the database");
        } else {
            for (Employee employee : employeeArrayList) {
                System.out.println(employee);
            }
        }
    }

    public String getNameSearchEmployee() {
        System.out.println("Enter NameSearch : ");
        return sc.nextLine();
    }
}
