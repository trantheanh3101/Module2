package MVC_Exercise.mvcStudentManager.repositories;

import MVC_Exercise.mvcStudentManager.models.Student;

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

    public int getCountStu() {
        return count;
    }

    public int getCapacity() {
        return students.length;
    }

    // Cung cấp truy cập mang tuong tu mang using , van bao toan private
    public Student[] getStudents() {
        Student[] studentNew = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            studentNew[i] = students[i];
        }
        return studentNew;
    }

    public void deleteStudent(int studentId) {
        for (int i = 0; i < count; i++) {
            if (students[i].getCode() == studentId) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null; // Loại bỏ phần tử thừa
                count--;
            }
        }
    }

}
