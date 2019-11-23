package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.model.Workingwomen;

@Repository("myWomenDao")
public class MyWomenDaoImpl implements MyWomenDaoIntf {
	@PersistenceContext
	EntityManager em;
	public boolean insertWorkingwomen(Workingwomen ww) {
		Boolean result=false;
		try{
			
			
			em.persist(ww);
			
			System.out.println("dao is called");
            result=true;
            em.close();
           
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	public List<Workingwomen> getUsers() {
		@SuppressWarnings("unchecked")
		List<Workingwomen> list=em.createQuery("SELECT w FROM Workingwomen w where w.status=:status").setParameter("status", "false").getResultList();
		System.out.println("dao is called");
		return list;
	}

	public List<Workingwomen> approvedrecords() {
		List<Workingwomen> list=em.createQuery("SELECT w FROM Workingwomen w where w.status=:status").setParameter("status", "true").getResultList();
		System.out.println("dao is called");
		return list;
	}

	public int approvedList(int wid) {
		String sql= " Update Workingwomen w set w.status=:status where w.wid=:wid";
		Query query = em.createQuery(sql).setParameter("status","true").setParameter("wid",wid);
		int result = query.executeUpdate();

		System.out.println("dao is called");
		return result;
	}

}
