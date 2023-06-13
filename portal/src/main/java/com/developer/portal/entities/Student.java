package com.developer.portal.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Entity
public class Student {

    @Id
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_name")
    @NotBlank(message = "Name should not be blank")
    private String studentName;

    @Column
    @NotBlank(message = "Date should not be blank")
    private LocalDate dateOfBirth;

    @Column
    @Min(value = 6, message = "Standard cannot be less than 6")
    @Max(value = 12, message = "Standard cannot go more than 12")
    @NotBlank(message = "Standard is mandatory")
    private int standard;

    @Column(name = "father_name",nullable = false)
    private String fatherName;

    @Column(name = "mother_name",nullable = false)
    private String motherName;

    @Column(name = "phone_number")
    @NotBlank(message = "Number should not be blank")
    private long phoneNumber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
