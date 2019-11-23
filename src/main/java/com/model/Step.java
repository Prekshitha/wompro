package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="step")
public class Step {

	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stepid;
	private String aadhar;
	 @Temporal(TemporalType.DATE)
	 @Column(name = "stepdob")
	 private Date stepdob;
	 private String marital;
	 private String qualification;
	 private String fathername;
	 private String mothername;
	 private String spousename;
	 private String child;
	 private String address;
	 private String stepemail;
	 private String aadhar_file;
	 private String pan;
	 private String course;
	public Step() {
		super();
	}
	
	public int getStepid() {
		return stepid;
	}

	public void setStepid(int stepid) {
		this.stepid = stepid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public Date getStepdob() {
		return stepdob;
	}
	public void setStepdob(Date stepdob) {
		this.stepdob = stepdob;
	}
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getSpousename() {
		return spousename;
	}
	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStepemail() {
		return stepemail;
	}
	public void setStepemail(String stepemail) {
		this.stepemail = stepemail;
	}
	public String getAadhar_file() {
		return aadhar_file;
	}
	public void setAadhar_file(String aadhar_file) {
		this.aadhar_file = aadhar_file;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Step [name=" + name + ", stepid=" + stepid + ", aadhar=" + aadhar + ", stepdob=" + stepdob
				+ ", marital=" + marital + ", qualification=" + qualification + ", fathername=" + fathername
				+ ", mothername=" + mothername + ", spousename=" + spousename + ", child=" + child + ", address="
				+ address + ", stepemail=" + stepemail + ", aadhar_file=" + aadhar_file + ", pan=" + pan + ", course="
				+ course + "]";
	}
	 
}

