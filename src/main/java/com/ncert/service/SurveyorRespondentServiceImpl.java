package com.ncert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncert.entities.SurveyorRespondent;
import com.ncert.repos.SurveyorRespondentRepository;

@Service
public class SurveyorRespondentServiceImpl implements SurveyorRespondentService {

	@Autowired
	private SurveyorRespondentRepository repo;
	
	@Override
	public List<SurveyorRespondent> getAll() {
		return repo.findAll();
	}

}
