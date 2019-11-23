package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.model.Hostel;
import com.model.Ngotable;
import com.model.Training;


@Repository("MyNgoDao")
public class MyNgoDaoImpl implements MyNgoDaoIntf{

	
	@PersistenceContext
	EntityManager em;
	
	public boolean insertngo(Ngotable ngo) {
		boolean result=false;

		System.out.println("dao ngo is called");
				try{
					
					em.persist(ngo);
					
		            result=true;
		            em.close();
		         
					
				}
				catch(Exception ee){
					System.out.println(ee.getMessage());
				}
				
				return result;
	}

	public List<Ngotable> getNgo() {
		
		@SuppressWarnings("unchecked")
		List<Ngotable> list=em.createQuery("SELECT n FROM ngo n").getResultList();
		System.out.println("dao is called");
		return list;
	
	}

	public boolean inserttraining(Training training) {
boolean result=false;
		
		try{
		
			em.persist(training);
			
			System.out.println("dao training is called");
            result=true;
            em.close();
          
			
		}
		catch(Exception ee){
			System.out.println(ee.getMessage());
		}
		
		return result;
	}

	public List<Training> gettraining() {
		
		@SuppressWarnings("unchecked")
		List<Training> list=em.createQuery("SELECT t FROM Training t").getResultList();
		System.out.println("dao is called");
		return list;
	
	}

	public boolean insertForm(Hostel hostel) {

		boolean flag=false;
		try{
			
			em.persist(hostel);
			
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

	public List<Hostel> getUserh() {
		
		@SuppressWarnings("unchecked")
		List<Hostel> list= em.createQuery("SELECT u FROM  Hostel u").getResultList();
		System.out.println("dao is called:"+ list.size());
		return list;
	}

	
}
