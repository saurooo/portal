package com.developer.portal.entities;

import com.developer.portal.enums.Affiliation;
import com.developer.portal.enums.Level;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "schools")
public class School {

    @Id
    @Column(name = "dise_code")
    private long diseCode;

    @Column(name = "school_name",unique = true)
    @NotBlank(message = "Name should not be blank")
    private String schoolName;

    @Enumerated(EnumType.STRING)
    private Affiliation affiliation;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Email
    @NotBlank(message = "Email should not be blank")
    private String schoolMail;

    @Column(name = "school_phone_number")
    @NotBlank(message = "Number should not be blank")
    private long schoolPhoneNumber;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "school")
    private List<User> users;

    @OneToMany(mappedBy = "school")
    private List<Event> events;
}
