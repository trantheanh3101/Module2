package MVC_Exercise.EmployeeManager.repositories;

import MVC_Exercise.EmployeeManager.model.Employee;
import MVC_Exercise.EmployeeManager.model.Enginner;
import MVC_Exercise.EmployeeManager.model.Staff;
import MVC_Exercise.EmployeeManager.model.Worker;

import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        employees.add(worker);
    }

    public void addEnginner(Enginner enginner) {
        employees.add(enginner);
    }

    public void addStaff(Staff staff) {
        employees.add(staff);
    }

    public ArrayList<Employee> getEmployeeList() {
        return employees;
    }

    public ArrayList<Employee> getEmployeeByName(String nameSearch) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(nameSearch)){
                result.add(employee);
            }
        }
        return result;
    }
}
