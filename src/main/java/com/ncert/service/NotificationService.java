package com.ncert.service;

import java.util.List;

import com.ncert.entities.NotificationGateway;

public interface NotificationService {
	
	NotificationGateway getNotificationId(int id);
	NotificationGateway updateNotification(NotificationGateway notification);
	List<NotificationGateway> getAll();

}
