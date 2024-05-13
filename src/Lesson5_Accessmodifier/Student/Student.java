package Lesson5_Accessmodifier.Student;

public class Student {
    private String name;
    private String classs;

    public Student(){
        this.name = "John";
        this.classs = "CO2";
    }

    protected void setClasss(String classs) {
        this.classs = classs;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }
}
