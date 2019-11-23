package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hostel")
public class Hostel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hid;
	 private String hname;
	 private String haddress;
	 private int roomcount;
	 
	 @OneToOne
		@JoinColumn(name="nid")
		private Ngotable ngo;

	public Hostel() {
		super();
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public int getRoomcount() {
		return roomcount;
	}

	public void setRoomcount(int roomcount) {
		this.roomcount = roomcount;
	}

	public Ngotable getNgo() {
		return ngo;
	}

	public void setNgo(Ngotable ngo) {
		this.ngo = ngo;
	}

	@Override
	public String toString() {
		return "Hostel [hid=" + hid + ", hname=" + hname + ", haddress=" + haddress + ", roomcount=" + roomcount
				+ ", ngo=" + ngo + "]";
	}
	 
	 
}
