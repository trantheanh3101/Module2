package MiniTest.Personnel_Management.model;

import MiniTest.Personnel_Management.services.ReviewSalary;

public class FullTimeEmployee extends Employee implements ReviewSalary {
    private double basicSalary;
    private double bonusSalary;
    private double penaltySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double basicSalary, double bonusSalary, double penaltySalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
    }

    public FullTimeEmployee(String name, String code, int age, String phoneNumber, String email, double basicSalary, double bonusSalary, double penaltySalary) {
        super(name, code, age, phoneNumber, email);
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getPenaltySalary() {
        return penaltySalary;
    }

    public void setPenaltySalary(double penaltySalary) {
        this.penaltySalary = penaltySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                "basicSalary=" + basicSalary +
                ", bonusSalary=" + bonusSalary +
                ", penaltySalary=" + penaltySalary +
                '}';
    }

    @Override
    public double getSalaryEmployee() {
        return getBasicSalary() + (bonusSalary - penaltySalary);
    }
}
