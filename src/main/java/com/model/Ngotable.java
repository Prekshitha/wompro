package com.model;

import java.util.ArrayList;
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


@Entity
@Table(name="modngo")
public class Ngotable {
	
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nid;
	private String nname;
	@Column(name="nmanager")
	private String nman;
	@Column(name="nobjective")
	private String nobj;
	private String contact;
	@Column(name="nlocation")
	private String nloc;
	private String status = "Not Approved";

	private String ncertificate;
	private String ncertificateid;
	
	
    @OneToOne
	@JoinColumn(name="userid")
    private Users users;
	
	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="nid")
	private List<Training> training = new ArrayList<Training>();


	public int getNid() {
		return nid;
	}


	public void setNid(int nid) {
		this.nid = nid;
	}


	public String getNname() {
		return nname;
	}


	public void setNname(String nname) {
		this.nname = nname;
	}


	public String getNman() {
		return nman;
	}


	public void setNman(String nman) {
		this.nman = nman;
	}


	public String getNobj() {
		return nobj;
	}


	public void setNobj(String nobj) {
		this.nobj = nobj;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getNloc() {
		return nloc;
	}


	public void setNloc(String nloc) {
		this.nloc = nloc;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	

	public String getNcertificate() {
		return ncertificate;
	}


	public void setNcertificate(String ncertificate) {
		this.ncertificate = ncertificate;
	}


	public String getNcertificateid() {
		return ncertificateid;
	}


	public void setNcertificateid(String ncertificateid) {
		this.ncertificateid = ncertificateid;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public List<Training> getTraining() {
		return training;
	}


	public void setTraining(List<Training> training) {
		this.training = training;
	}


	public Ngotable() {
		super();
	}


	@Override
	public String toString() {
		return "Ngotable [nid=" + nid + ", nname=" + nname + ", nman=" + nman + ", nobj=" + nobj + ", contact="
				+ contact + ", nloc=" + nloc + ", status=" + status +" , ncertificate=" + ncertificate
				+ ", ncertificateid=" + ncertificateid + "]";
	}
}
