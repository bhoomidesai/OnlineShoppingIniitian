package com.niit.collaborationpjtbackend.dao;

import java.util.List;

import com.niit.collaborationpjtbackend.model.jobcarrier;



public interface jobcarrier_dao {

	public void savejob(jobcarrier job);
	
	public List<jobcarrier> showalljob();
	
	public jobcarrier getjobbyid(String id);
	
	public void updatejob(jobcarrier job);
	
	public void deletejob(String id);
}
