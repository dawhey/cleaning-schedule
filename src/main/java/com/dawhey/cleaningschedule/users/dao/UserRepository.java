package com.dawhey.cleaningschedule.users;

import com.dawhey.cleaningschedule.entities.ScheduleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ScheduleUser, Long> {

    public ScheduleUser findOneByEmail(String email);
}