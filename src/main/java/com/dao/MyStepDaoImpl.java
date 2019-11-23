package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Step;
@Repository("myUserDao")
public class MyStepDaoImpl implements MyStepDaoIntf {

	@PersistenceContext
	EntityManager em;
	public boolean insertStepForm(Step step) {
			boolean flag=false;
			try{
				
				em.persist(step);
				
			    em.close();
			   
			    flag=true;
			    System.out.println("dao called");
			    System.out.println("Done");
				}
				catch (Exception e){
					System.out.println("Error"+e);
				}
			
			return flag;
		}

	public List<Step> getUserstep() {
		@SuppressWarnings("unchecked")
		List<Step> lists= em.createQuery("SELECT u FROM  Step u").getResultList();
		System.out.println("dao is called:"+ lists.size());
		return lists;
	}

}
