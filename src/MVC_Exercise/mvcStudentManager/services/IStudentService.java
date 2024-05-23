package MVC_Exercise.mvcStudentManager.services;

import MVC_Exercise.mvcStudentManager.models.Student;

public interface IStudentService{
    boolean add(Student student);
    Student[] getAllStudents();
    boolean delete(int studentId);
    Student getStudentByIndex(int idEdit);
    boolean updateStudent(Student updatedStudent);
}
