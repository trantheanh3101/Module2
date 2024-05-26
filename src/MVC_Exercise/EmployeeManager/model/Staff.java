package MVC_Exercise.EmployeeManager.model;

public class Staff extends Employee {
    private String work;

    public Staff() {
    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "work='" + work + '\'' +
                '}';
    }
}
