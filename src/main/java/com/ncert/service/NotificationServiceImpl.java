package com.ncert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncert.entities.NotificationGateway;
import com.ncert.repos.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private NotificationRepository repo;

	@Override
	public List<NotificationGateway> getAll() {
		return repo.findAll();
	}
	
	@Override
	public NotificationGateway getNotificationId(int id) {
		NotificationGateway notification = repo.findById(id).get();
		return notification;
		 
	}

	@Override
	public NotificationGateway updateNotification(NotificationGateway notification) {
		return repo.save(notification);
	}

	

}
