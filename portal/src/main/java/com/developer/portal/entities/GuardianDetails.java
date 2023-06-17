package com.developer.portal.entities;

import javax.persistence.*;

@Entity
@Table(name = "guardian_details")
public class GuardianDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guardian_details_id")
    private int guardianDetailsId;

    @Column(name = "father_name",nullable = false)
    private String fatherName;

    @Column(name = "mother_name",nullable = false)
    private String motherName;

}
