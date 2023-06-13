package com.developer.portal.entities;

import javax.persistence.*;

@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transfers")
    private int transferId;

}
