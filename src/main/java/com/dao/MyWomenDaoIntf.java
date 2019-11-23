package com.dao;

import java.util.List;

import com.model.Workingwomen;

public interface MyWomenDaoIntf {
	public boolean insertWorkingwomen(Workingwomen ww);
	public List<Workingwomen> getUsers();
    public List<Workingwomen> approvedrecords();
	public int approvedList(int wid);
}
