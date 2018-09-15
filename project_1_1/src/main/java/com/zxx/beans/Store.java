package com.zxx.beans;

import org.springframework.stereotype.Component;

@Component
public class Store {
	
	private Integer sid;
	private String sname;
	private String sclass;
	private String stype;
	private String sinfo;
	private String sm_info;
	private String stime;
	private String sstate;
	private String sreason;
	private Integer u_id;
	
	
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Store(Integer sid, String sname, String sclass, String stype,
			String sinfo, String sm_info, String stime, String sstate,
			String sreason, Integer u_id) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
		this.stype = stype;
		this.sinfo = sinfo;
		this.sm_info = sm_info;
		this.stime = stime;
		this.sstate = sstate;
		this.sreason = sreason;
		this.u_id = u_id;
	}




	public Integer getSid() {
		return sid;
	}




	public void setSid(Integer sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public String getSclass() {
		return sclass;
	}




	public void setSclass(String sclass) {
		this.sclass = sclass;
	}




	public String getStype() {
		return stype;
	}




	public void setStype(String stype) {
		this.stype = stype;
	}




	public String getSinfo() {
		return sinfo;
	}




	public void setSinfo(String sinfo) {
		this.sinfo = sinfo;
	}




	public String getSm_info() {
		return sm_info;
	}




	public void setSm_info(String sm_info) {
		this.sm_info = sm_info;
	}




	public String getStime() {
		return stime;
	}




	public void setStime(String stime) {
		this.stime = stime;
	}




	public String getSstate() {
		return sstate;
	}




	public void setSstate(String sstate) {
		this.sstate = sstate;
	}




	public String getSreason() {
		return sreason;
	}




	public void setSreason(String sreason) {
		this.sreason = sreason;
	}




	public Integer getU_id() {
		return u_id;
	}




	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}




	@Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass
				+ ", stype=" + stype + ", sinfo=" + sinfo + ", sm_info="
				+ sm_info + ", stime=" + stime + ", sstate=" + sstate
				+ ", sreason=" + sreason + ", u_id=" + u_id + "]";
	}
	
	

}
