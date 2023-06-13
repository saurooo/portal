package com.developer.portal.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private int addressId;
    @Column(name = "pin_code")
    @NotBlank(message = "PinCode should not be blank")
    private int pinCode;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
}
