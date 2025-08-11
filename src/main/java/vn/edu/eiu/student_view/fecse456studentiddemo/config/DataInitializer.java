package vn.edu.eiu.student_view.fecse456studentiddemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Major;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Student;
import vn.edu.eiu.student_view.fecse456studentiddemo.service.MajorService;
import vn.edu.eiu.student_view.fecse456studentiddemo.service.StudentService;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private MajorService majorService;
    @Autowired
    private StudentService studentService;
    @Override
    public void run(String... args) throws Exception {

        Major m1 = new Major("CSE456", "Computer Science and Engineering");
        majorService.saveMajor(m1);


        Student s1 = new Student("001", "John", 1999, 3.8);
        Student s2 = new Student("002", "Jane", 1998, 3.9);
        Student s3 = new Student("003", "Mike", 1997, 4.0);



        m1.addStudent(s1);
        majorService.saveMajor(m1);
        studentService.saveStudent(s2);
        studentService.saveStudent(s3);
    }
}
