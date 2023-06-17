package com.developer.portal.entities;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @Column(name = "event_id")
    private long eventId;
    @Column(name = "event_name")
    private String eventName;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}
