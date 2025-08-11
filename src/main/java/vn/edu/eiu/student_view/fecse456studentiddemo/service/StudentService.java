package vn.edu.eiu.student_view.fecse456studentiddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Major;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Student;
import vn.edu.eiu.student_view.fecse456studentiddemo.repository.MajorRepository;
import vn.edu.eiu.student_view.fecse456studentiddemo.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }

    public List<Student> listStudent(){
        return studentRepository.findAll();
    }
}
