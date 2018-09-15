package com.zxx.beans;

import java.util.Date;

public class Feedback {
	private int id;
	private String f_uname;
	private String f_uphone;
	private String f_uemail;
	private String mcontent;
	private Date ftime;
	private String fstate;
	private String fclass;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int id, String f_uname, String f_uphone, String f_uemail,
			String mcontent, Date ftime, String fstate, String fclass) {
		super();
		this.id = id;
		this.f_uname = f_uname;
		this.f_uphone = f_uphone;
		this.f_uemail = f_uemail;
		this.mcontent = mcontent;
		this.ftime = ftime;
		this.fstate = fstate;
		this.fclass = fclass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_uname() {
		return f_uname;
	}
	public void setF_uname(String f_uname) {
		this.f_uname = f_uname;
	}
	public String getF_uphone() {
		return f_uphone;
	}
	public void setF_uphone(String f_uphone) {
		this.f_uphone = f_uphone;
	}
	public String getF_uemail() {
		return f_uemail;
	}
	public void setF_uemail(String f_uemail) {
		this.f_uemail = f_uemail;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public Date getFtime() {
		return ftime;
	}
	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}
	public String getFstate() {
		return fstate;
	}
	public void setFstate(String fstate) {
		this.fstate = fstate;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", f_uname=" + f_uname + ", f_uphone="
				+ f_uphone + ", f_uemail=" + f_uemail + ", mcontent="
				+ mcontent + ", ftime=" + ftime + ", fstate=" + fstate
				+ ", fclass=" + fclass + "]";
	}
	
}
