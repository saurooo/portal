package com.developer.portal.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "personal_documents")
public class PersonalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private long documentId;

    @Column(name = "aadhar_number")
    @NotBlank(message = "Aadhar Number should not be blank")
    private long aadharNumber;

    @Column(name = "pan_number")
    @NotBlank(message = "PAN Number should not be blank")
    private String panNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

}
