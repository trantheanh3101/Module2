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

        if (studentRepository.getCountStu() >= studentRepository.getCapacity()) {
            System.out.println("Mảng đã đầy, không thể thêm sinh viên mới.");
            return false;
        }

        for (int i = 0; i < studentRepository.getCountStu(); i++) {
            Student existingStudent = getStudentByIndex(i);
            if (existingStudent != null && existingStudent.getCode() == student.getCode()) {
                System.out.println("Học sinh đã tồn tại trong mảng.");
                return false;
            }
        }
        if(student.getCode() <0 || student.getCode()>1000000) {
            return false;
        }
        studentRepository.add(student);
        return true;
    }

    public Student getStudentByIndex(int index) {
        if (index >= 0 && index < studentRepository.getCountStu()) {
            return studentRepository.getStudents()[index];
        }
        return null;
    }
}
