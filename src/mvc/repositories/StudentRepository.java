package mvc.repositories;

import mvc.models.Student;

public class StudentRepository {
    private static Student[] students = new Student[100];
    private static int count = 0;

    static {
        students[0] = new Student(1, "HaiTT", "Quảng Nam", "C1123G1");
        count = 1;
    }

    public void add(Student student) {
        students[count] = student;
        count++;
    }
}
