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
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admission_logs")
@Entity
public class AdmissionLog {

    @Id
    @Column(name = "admission_log_id")
    private Integer admissionLogId;

    @Column(name = "sr_no")
    private long srNo;

    @Column
    @Min(value = 6, message = "Standard cannot be less than 6")
    @Max(value = 12, message = "Standard cannot go more than 12")
    @NotBlank(message = "Standard is mandatory")
    private int standard;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate session;

    @Column(name = "date_of_admission")
    private LocalDate dateOfAdmission;

    @OneToMany(mappedBy = "student")
    private List<Certificate> certificates;

}
