package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


	@Entity
	@Table(name="ssydetails")
	public class Sukanya {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int ssyid;
		 private String gname;
		 private String cname;
		 @Temporal(TemporalType.DATE)
		 @Column(name = "udob")
		 private Date udob;
		 private String nationality;
		 private String gaadhar;
		 private String address;
		 private String  dob_certificate;
		 private String guardian_aadhar;
		/* @OneToOne
		  @JoinColumn(name="userid")
		    private Users users;*/
		public Sukanya() {
			super();
		}
		public int getSsyid() {
			return ssyid;
		}
		public void setSsyid(int ssyid) {
			this.ssyid = ssyid;
		}
		public String getGname() {
			return gname;
		}
		public void setGname(String gname) {
			this.gname = gname;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public Date getUdob() {
			return udob;
		}
		public void setUdob(Date udob) {
			this.udob = udob;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getGaadhar() {
			return gaadhar;
		}
		public void setGaadhar(String gaadhar) {
			this.gaadhar = gaadhar;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob_certificate() {
			return dob_certificate;
		}
		public void setDob_certificate(String dob_certificate) {
			this.dob_certificate = dob_certificate;
		}
		public String getGuardian_aadhar() {
			return guardian_aadhar;
		}
		public void setGuardian_aadhar(String guardian_aadhar) {
			this.guardian_aadhar = guardian_aadhar;
		}
		@Override
		public String toString() {
			return "Sukanya [ssyid=" + ssyid + ", gname=" + gname + ", cname=" + cname + ", udob=" + udob
					+ ", nationality=" + nationality + ", gaadhar=" + gaadhar + ", address=" + address
					+ ", dob_certificate=" + dob_certificate + ", guardian_aadhar=" + guardian_aadhar + "]";
		}
		
		
}
