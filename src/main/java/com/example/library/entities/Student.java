package com.example.library.entities;

import jakarta.persistence.*;

@Entity
@Table(
        name = "student"
)
// name, roll number, phone number, father's name

// make a table - teacher - id(table ki ID), name, teacher_id, mobile number, department
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "roll_number")
    private String rollNumber;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "father_name")
    private String fatherName;
}
