package MVC_Exercise.EmployeeManager.serveces;

import MVC_Exercise.EmployeeManager.model.Employee;
import MVC_Exercise.EmployeeManager.model.Enginner;
import MVC_Exercise.EmployeeManager.model.Staff;
import MVC_Exercise.EmployeeManager.model.Worker;
import MVC_Exercise.EmployeeManager.repositories.EmployeeManager;
import MVC_Exercise.EmployeeManager.view.EmployeeView;

import java.util.ArrayList;

public class EmployeeServeces {
    private EmployeeManager employeeManager;

    public EmployeeServeces() {
        this.employeeManager = new EmployeeManager();
    }

    public void addWorker(EmployeeView employeeView) {
        Worker worker = employeeView.getDetailWorker();
        employeeManager.addWorker(worker);
        employeeView.getMessengerOK();
    }

    public void addEnginner(EmployeeView employeeView) {
        Enginner enginner = employeeView.getDetailEnginner();
        employeeManager.addEnginner(enginner);
        employeeView.getMessengerOK();
    }

    public void addStaff(EmployeeView employeeView) {
        Staff staff = employeeView.getDetailStaff();
        employeeManager.addStaff(staff);
        employeeView.getMessengerOK();
    }

    public void displayEmployee(EmployeeView employeeView) {
        ArrayList<Employee> employeeArrayList = employeeManager.getEmployeeList();
        employeeView.displayEmployee(employeeArrayList);
    }

    public void searchEmployeeByName(EmployeeView employeeView) {
        String nameSearch = employeeView.getNameSearchEmployee();
        ArrayList<Employee> result = employeeManager.getEmployeeByName(nameSearch);
        employeeView.displayEmployee(result);
    }
}
