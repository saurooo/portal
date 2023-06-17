package com.developer.portal.entities;

import javax.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id")
    private long certificateId;

    @Column(name = "certificate_name")
    private String certificateName;

    @Column(name = "certificate_link")
    private String certificateLink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "admission_log_id")
    private AdmissionLog student;

}
