package com.developer.portal.entities;

import com.developer.portal.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name",unique = true,nullable = false)
    private String userName;

    @Column(columnDefinition = "text")
    @NotBlank(message = "Password should not be blank")
    private String password;

    @Column
    @NotBlank(message = "Date should not be blank")
    private LocalDate dateOfBirth;

    @Column(name = "first_name")
    @NotBlank(message = "Name should not be blank")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Email
    @NotBlank(message = "Email should not be blank")
    private String mail;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "aadhar_number")
    @NotBlank(message = "Aadhar Number should not be blank")
    private long aadharNumber;

    @Column(name = "pan_number")
    @NotBlank(message = "PAN Number should not be blank")
    private String panNumber;

    @ManyToOne
    @JoinColumn(name = "school_dise_code", nullable = true)
    private School school;

    @OneToMany
    @JoinColumn(name = "guardian_details_id")
    private GuardianDetails guardianDetails;

    @OneToMany
    @JoinColumn(name = "contact_id")
    private Contact contact;
    
}
