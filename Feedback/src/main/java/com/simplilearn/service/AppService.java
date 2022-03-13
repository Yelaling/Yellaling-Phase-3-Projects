package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.MyRepo;
import com.simplilearn.entity.Feedback;

@Service
public class AppService {

	@Autowired
	private MyRepo myRepo;
	
	public boolean addFeedback( Feedback f) {
		myRepo.save(f);
		return true;
	}
}