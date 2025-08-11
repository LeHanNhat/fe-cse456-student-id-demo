package vn.edu.eiu.student_view.fecse456studentiddemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;


    @Column(name = "username",columnDefinition = "VARCHAR(50)",nullable = false)
    private String username;

    @Column(name = "password",columnDefinition = "VARCHAR(255)",nullable = false)
    private String password;

    @Column(name = "role",columnDefinition = "INT",nullable = false)
    private int role;
}
