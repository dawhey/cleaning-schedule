package com.dawhey.cleaningschedule.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cleanings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cleaning {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Boolean done = false;

    @Column(nullable = false)
    private Date cleaningDate;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "schedule_user_id")
    private ScheduleUser scheduleUser;
}
