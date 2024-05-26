package MVC_Exercise.EmployeeManager.model;

public class Enginner extends Employee {
    private String majors;

    public Enginner() {
    }

    public Enginner(String majors) {
        this.majors = majors;
    }

    public Enginner(String name, int age, String gender, String address, String majors) {
        super(name, age, gender, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Enginner{" + super.toString() +
                "majors='" + majors + '\'' +
                '}';
    }
}
