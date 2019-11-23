package com.service;

import java.util.List;

import com.model.Workingwomen;

public interface MyWomenServiceIntf {
	public boolean insertWorkingwomen(Workingwomen ww);
	public List<Workingwomen> getUsers();
	public int approvedList(int wid);
	public List<Workingwomen> approvedrecords();
}
