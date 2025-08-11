package vn.edu.eiu.student_view.fecse456studentiddemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_Student")
public class Student {
    @Id
    @Column(name = "Id",columnDefinition = "CHAR(5)")
    private String id;

    @Column(name = "Name",columnDefinition = "VARCHAR(100)",nullable = false)
    private String name;

    @Column(name = "Year_of_birth",columnDefinition = "YEAR",nullable = false)
    private int yearOfBirth;


    @Column(name = "Gpa",columnDefinition = "DECIMAL(3,2)")
    private double gpa;

    @ManyToOne
    @JoinColumn(name = "major_id")
    private Major major;


    public Student(String id, String name, int yearOfBirth, double gpa) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gpa = gpa;
    }
}
