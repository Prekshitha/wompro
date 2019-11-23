package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




	
	@Entity
	@Table(name="workingwomen")
	public class Workingwomen {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int wid;
		
		private String name;
		@Column(unique=true)
		private String adharno;
		
		private String address;
		@Temporal(TemporalType.DATE)
		private Date dob;
		private String caste;
		private String contact;
		private String phychal;
		private String ngo;
		private int trainingperiod;
		private String status;
		private String dob_fname;
		private String address_fname;
		private String image;
		

	    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="wid")
		private List<Girlboydaycare> glist = new ArrayList<Girlboydaycare>();
	    @OneToOne
		@JoinColumn(name="userid")
	    private Users users;
		private double grossIncome;
		public int getWid() {
			return wid;
		}
		public void setWid(int wid) {
			this.wid = wid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdharno() {
			return adharno;
		}
		public void setAdharno(String adharno) {
			this.adharno = adharno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getCaste() {
			return caste;
		}
		public void setCaste(String caste) {
			this.caste = caste;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getPhychal() {
			return phychal;
		}
		public void setPhychal(String phychal) {
			this.phychal = phychal;
		}
		public String getNgo() {
			return ngo;
		}
		public void setNgo(String ngo) {
			this.ngo = ngo;
		}
		public int getTrainingperiod() {
			return trainingperiod;
		}
		public void setTrainingperiod(int trainingperiod) {
			this.trainingperiod = trainingperiod;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDob_fname() {
			return dob_fname;
		}
		public void setDob_fname(String dob_fname) {
			this.dob_fname = dob_fname;
		}
		public String getAddress_fname() {
			return address_fname;
		}
		public void setAddress_fname(String address_fname) {
			this.address_fname = address_fname;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public List<Girlboydaycare> getGlist() {
			return glist;
		}
		public void setGlist(List<Girlboydaycare> glist) {
			this.glist = glist;
		}
		public Users getUsers() {
			return users;
		}
		public void setUsers(Users users) {
			this.users = users;
		}
		public double getGrossIncome() {
			return grossIncome;
		}
		public void setGrossIncome(double grossIncome) {
			this.grossIncome = grossIncome;
		}
		public Workingwomen() {
			super();
		}
		@Override
		public String toString() {
			return "Workingwomen [wid=" + wid + ", name=" + name + ", adharno=" + adharno + ", address=" + address
					+ ", dob=" + dob + ", caste=" + caste + ", contact=" + contact + ", phychal=" + phychal + ", ngo="
					+ ngo + ", trainingperiod=" + trainingperiod + ", status=" + status + ", dob_fname=" + dob_fname
					+ ", address_fname=" + address_fname + ", image=" + image + ", users=" + users + ", grossIncome="
					+ grossIncome + "]";
		}

		
	

}
