package MiniTest.Personnel_Management.model;

import MiniTest.Personnel_Management.services.ReviewSalary;

public class PartTimeEmployee extends Employee implements ReviewSalary {
    private double overtimeHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public PartTimeEmployee(String name, String code, int age, String phoneNumber, String email, double overtimeHours) {
        super(name, code, age, phoneNumber, email);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return super.toString() + "overtimeHours=" + overtimeHours + '}';
    }

    @Override
    public double getSalaryEmployee() {
        return getOvertimeHours() * 100;
    }
}
