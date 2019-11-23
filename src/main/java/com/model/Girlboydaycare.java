package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




	@Entity
	@Table(name="girlboydaycare")
	public class Girlboydaycare {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String gender;
		@Temporal(TemporalType.DATE)
		private Date dob;
		
		
		@ManyToOne
		@JoinColumn(name="wid")
		private Workingwomen workingwomen;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public Date getDob() {
			return dob;
		}


		public void setDob(Date dob) {
			this.dob = dob;
		}


		public Workingwomen getWorkingwomen() {
			return workingwomen;
		}


		public void setWorkingwomen(Workingwomen workingwomen) {
			this.workingwomen = workingwomen;
		}


		public Girlboydaycare() {
			super();
		}


		@Override
		public String toString() {
			return "Girlboydaycare [id=" + id + ", gender=" + gender + ", dob=" + dob + "]";
		}


		

}
