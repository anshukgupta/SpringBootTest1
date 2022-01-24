package com.ncert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncert.entities.MasterScheduler;
import com.ncert.repos.MasterSchedulerRepository;

@Service
public class MasterSchedulerServiceImpl implements MasterSchedulerService {
	
	@Autowired
	private MasterSchedulerRepository repo;

	@Override
	public List<MasterScheduler> getAll() {
		return repo.findAll();
	}
	
	@Override
	public MasterScheduler getMasterSchedulerId(int id) {
		MasterScheduler masterScheduler = repo.findById(id).get();
		return masterScheduler;
	}

	@Override
	public MasterScheduler updateMaster(MasterScheduler master) {
		return repo.save(master);
	}

	

}
