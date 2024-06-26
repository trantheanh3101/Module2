package MVC_Exercise.mvcStudentManager.services.impl;

import MVC_Exercise.mvcStudentManager.models.Student;
import MVC_Exercise.mvcStudentManager.repositories.StudentRepository;
import MVC_Exercise.mvcStudentManager.services.IStudentService;


public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public boolean add(Student student) {
//        Kiểm tra dữ liệu
        if(student.getName().equals("")) {
            return false;
        }

        if(student.getCode() <0 || student.getCode()>1000000) {
            return false;
        }

        if (studentRepository.getCountStu() >= studentRepository.getCapacity()) {
//            System.out.println("Mảng đã đầy, không thể thêm sinh viên mới.");
            return false;
        }

        for (int i = 0; i < studentRepository.getCountStu(); i++) {
            Student checkStudent = getStudentByIndex(i);
            if (checkStudent != null && checkStudent.getCode() == student.getCode()) {
//                System.out.println("Học sinh đã tồn tại trong mảng.");
                return false;
            }
        }

        studentRepository.add(student);
        return true;
    }

    @Override
    public Student[] getAllStudents() {
        return studentRepository.getStudents();
    }

    @Override
    public boolean delete(int studentId) {
        int index = -1;
        for (int i = 0; i < studentRepository.getCountStu(); i++) {
            if (studentRepository.getStudents()[i].getCode() == studentId){
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }

        studentRepository.deleteStudent(studentId);
        return true;
    }

    public boolean updateStudent(Student updatedStudent) {
        Student student;
        for (int i = 0; i < studentRepository.getCountStu(); i++) {
            student = studentRepository.getStudents()[i];
            if (student.getCode() == updatedStudent.getCode()) {
                student = updatedStudent;
                return true;
            }
        }
        return false;
    }

    public Student getStudentByIndex(int index) {
        if (index >= 0 && index < studentRepository.getCountStu()) {
            return studentRepository.getStudents()[index];
        }
        return null;
    }
}
