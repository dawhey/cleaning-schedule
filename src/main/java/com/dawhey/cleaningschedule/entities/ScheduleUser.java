package com.dawhey.cleaningschedule.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "schedule_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "scheduleUser")
    private Set<Cleaning> cleanings = new HashSet<>();
}
