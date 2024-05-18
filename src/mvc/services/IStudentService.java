package mvc.services;

import mvc.models.Student;

public interface IStudentService{
    boolean add(Student student);
    Student[] getAllStudents();
    boolean delete(int studentId);
}
