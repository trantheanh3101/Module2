package mvc.services.impl;

import mvc.models.Student;
import mvc.repositories.StudentRepository;
import mvc.services.IStudentService;

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
        studentRepository.add(student);
        return true;
    }
}
