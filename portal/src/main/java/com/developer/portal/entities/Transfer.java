package com.developer.portal.entities;

import com.developer.portal.enums.Status;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transfers")
    private int transferId;

    @Enumerated(EnumType.STRING)
    private Status status;

}
