package com.ncert.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncert.entities.NotificationGateway;

public interface NotificationRepository extends JpaRepository<NotificationGateway, Integer> {

}
