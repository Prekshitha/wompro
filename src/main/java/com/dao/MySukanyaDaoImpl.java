package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Sukanya;
@Repository("mySukDao")
public class MySukanyaDaoImpl implements MySukanyaDaoIntf {

	@PersistenceContext
	EntityManager em;
	public boolean insertForm(Sukanya sukanya) {
		System.out.println("dao called");
		boolean flag=false;
		try{
			
			em.persist(sukanya);
		
		    em.close();
		   
		    flag=true;
		    System.out.println("Done");
			}
			catch (Exception e){
				System.out.println("Error"+e);
			}
		
		return flag;
	}

	public List<Sukanya> getUser() {

		@SuppressWarnings("unchecked")
		List<Sukanya> list= em.createQuery("SELECT u FROM  Sukanya u").getResultList();
		System.out.println("dao is called:"+ list.size());
		return list;
	}
	}
	

	
