package com.zxx.beans;

import org.springframework.stereotype.Component;

@Component
public class Record {
	
	private Integer id;

    private Integer r_uid;
    
    private String r_uname;
    
    private Integer rintegral;
    
    private Integer rview;
    
    private Integer rpencent;
    
    
    public Record() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Record(Integer id, Integer r_uid, String r_uname, Integer rintegral,
			Integer rview, Integer rpencent) {
		super();
		this.id = id;
		this.r_uid = r_uid;
		this.r_uname = r_uname;
		this.rintegral = rintegral;
		this.rview = rview;
		this.rpencent = rpencent;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getR_uid() {
		return r_uid;
	}


	public void setR_uid(Integer r_uid) {
		this.r_uid = r_uid;
	}


	public String getR_uname() {
		return r_uname;
	}


	public void setR_uname(String r_uname) {
		this.r_uname = r_uname;
	}


	public Integer getRintegral() {
		return rintegral;
	}


	public void setRintegral(Integer rintegral) {
		this.rintegral = rintegral;
	}


	public Integer getRview() {
		return rview;
	}


	public void setRview(Integer rview) {
		this.rview = rview;
	}


	public Integer getRpencent() {
		return rpencent;
	}


	public void setRpencent(Integer rpencent) {
		this.rpencent = rpencent;
	}


	@Override
	public String toString() {
		return "Record [id=" + id + ", r_uid=" + r_uid + ", r_uname=" + r_uname
				+ ", rintegral=" + rintegral + ", rview=" + rview
				+ ", rpencent=" + rpencent + "]";
	}
    
    
    
    
    

}
