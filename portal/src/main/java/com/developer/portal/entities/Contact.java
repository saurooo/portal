package com.developer.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "country_code")
    private int countryCode;

}
