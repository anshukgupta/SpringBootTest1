package com.ncert.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncert.entities.MasterScheduler;

public interface MasterSchedulerRepository extends JpaRepository<MasterScheduler, Integer> {

}
