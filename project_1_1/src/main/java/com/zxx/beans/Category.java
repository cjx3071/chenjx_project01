package com.zxx.beans;

import java.util.Date;

public class Category {
	private int id;
	private int cid;
	private int csort;
	private String cname;
	private String cintfo;
	private Date ctime;
	private String cstate;
	public Category() {
		super();
	}
	public Category(int id, int cid, int csort, String cname, String cintfo,
			Date ctime, String cstate) {
		super();
		this.id = id;
		this.cid = cid;
		this.csort = csort;
		this.cname = cname;
		this.cintfo = cintfo;
		this.ctime = ctime;
		this.cstate = cstate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCsort() {
		return csort;
	}
	public void setCsort(int csort) {
		this.csort = csort;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCintfo() {
		return cintfo;
	}
	public void setCintfo(String cintfo) {
		this.cintfo = cintfo;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	
	
}
