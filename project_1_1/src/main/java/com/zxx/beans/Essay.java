package com.zxx.beans;

import java.util.Date;

public class Essay {
	private int id;
	private int esort;
	private String eclass;
	private String etitle;
	private String eintfo;
	private Date etime;
	private String estate;
	public Essay() {
		super();
	}
	public Essay(int id, int esort, String eclass, String etitle,
			String eintfo, Date etime, String estate) {
		super();
		this.id = id;
		this.esort = esort;
		this.eclass = eclass;
		this.etitle = etitle;
		this.eintfo = eintfo;
		this.etime = etime;
		this.estate = estate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEsort() {
		return esort;
	}
	public void setEsort(int esort) {
		this.esort = esort;
	}
	public String getEclass() {
		return eclass;
	}
	public void setEclass(String eclass) {
		this.eclass = eclass;
	}
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}
	public String getEintfo() {
		return eintfo;
	}
	public void setEintfo(String eintfo) {
		this.eintfo = eintfo;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	
}
