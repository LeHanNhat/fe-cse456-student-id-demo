package vn.edu.eiu.student_view.fecse456studentiddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.eiu.student_view.fecse456studentiddemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public String listStudent(Model model){
       model.addAttribute("studentList", studentService.listStudent());
       return "student-list";
    }
//    @PostMapping("/student")
//    public String saveStudent(Model model){
//        model.addAttribute("studentList", studentService.listStudent());
//        return "student-list";
//    }
}
