package com.model;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="training")
public class Training {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid; 
//	private int nid; 
	private String tname;
	private String tduration;
	private String ttype;

	@Column(name="startDate")
	@Temporal(TemporalType.DATE)
	private Date sdate;
	@Column(name="endDate")
	@Temporal(TemporalType.DATE)
	private Date edate;
	
	@Column(name="nextBatch")
	private Date nbatch;
	private String status = "Not Approved";
	
	@ManyToOne
	@JoinColumn(name="nid")
	private Ngotable ngo;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getTduration() {
		return tduration;
	}

	public void setTduration(String tduration) {
		this.tduration = tduration;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public Date getNbatch() {
		return nbatch;
	}

	public void setNbatch(Date nbatch) {
		this.nbatch = nbatch;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Ngotable getNgo() {
		return ngo;
	}

	public void setNgo(Ngotable ngo) {
		this.ngo = ngo;
	}

	public Training() {
		super();
	}

	@Override
	public String toString() {
		return "Training [tid=" + tid + ", tname=" + tname + ", ttype=" + ttype + ", tduration=" + tduration
				+ ", sdate=" + sdate + ", edate=" + edate + ", nbatch=" + nbatch + ", status=" + status + ", ngo=" + ngo
				+ "]";
	}

	
	

}
