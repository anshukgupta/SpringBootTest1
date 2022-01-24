package com.ncert.service;

import java.util.List;

import com.ncert.entities.MasterScheduler;
import com.ncert.entities.NotificationGateway;

public interface MasterSchedulerService {
	
	MasterScheduler getMasterSchedulerId(int id);
	MasterScheduler updateMaster(MasterScheduler master);
	List<MasterScheduler> getAll();
	
}
