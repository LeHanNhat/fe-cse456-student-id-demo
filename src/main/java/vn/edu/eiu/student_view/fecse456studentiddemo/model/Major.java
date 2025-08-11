package vn.edu.eiu.student_view.fecse456studentiddemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_Major")

public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Name",columnDefinition = "VARCHAR(100)" , nullable = false)
    private String name;

    @Column(name="Description",columnDefinition = "TEXT")
    private String description;


    //kết nối với bảng sinh viên
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "major")
    private List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
        student.setMajor(this);
    }

    public void deleteStudent(Student student){
        studentList.remove(student);
        student.setMajor(null);
    }
    public Major(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
