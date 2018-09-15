package com.zxx.beans;

import org.springframework.stereotype.Component;

/*
 *	@Component("id")就是以注解的方式来实现IOC。并将bean命名为id
 *	它需要在配置文件中<context:component-scan>标签指定扫描注解。
 *	如果注解中不带id，则默认以类名的首字母小写为bean的名称。
 */
@Component
public class User {
	
	
    private Integer uid;

    private String uusername;

    private String uname;

    private String usex;

    private String utelephone;
    
    private String uphone;
    
    private String uemail;
    
    private String uaddress;
    
    private String utime;
    
    private String ugrade;
    
    private Integer uintegral;
    
    private String ustate;
    
    private Integer r_uid;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User( Integer uid, String uusername, String uname,
			String usex, String utelephone, String uphone, String uemail,
			String uaddress, String utime, String ugrade, Integer uintegral,
			String ustate, Integer r_uid) {
		super();
		this.uid = uid;
		this.uusername = uusername;
		this.uname = uname;
		this.usex = usex;
		this.utelephone = utelephone;
		this.uphone = uphone;
		this.uemail = uemail;
		this.uaddress = uaddress;
		this.utime = utime;
		this.ugrade = ugrade;
		this.uintegral = uintegral;
		this.ustate = ustate;
		this.r_uid = r_uid;
	}


	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUusername() {
		return uusername;
	}

	public void setUusername(String uusername) {
		this.uusername = uusername;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUtelephone() {
		return utelephone;
	}

	public void setUtelephone(String utelephone) {
		this.utelephone = utelephone;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUtime() {
		return utime;
	}

	public void setUtime(String utime) {
		this.utime = utime;
	}

	public String getUgrade() {
		return ugrade;
	}

	public void setUgrade(String ugrade) {
		this.ugrade = ugrade;
	}

	public Integer getUintegral() {
		return uintegral;
	}

	public void setUintegral(Integer uintegral) {
		this.uintegral = uintegral;
	}

	public String getUstate() {
		return ustate;
	}

	public void setUstate(String ustate) {
		this.ustate = ustate;
	}

	public Integer getR_uid() {
		return r_uid;
	}

	public void setR_uid(Integer r_uid) {
		this.r_uid = r_uid;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uusername=" + uusername
				+ ", uname=" + uname + ", usex=" + usex + ", utelephone="
				+ utelephone + ", uphone=" + uphone + ", uemail=" + uemail
				+ ", uaddress=" + uaddress + ", utime=" + utime + ", ugrade="
				+ ugrade + ", uintegral=" + uintegral + ", ustate=" + ustate
				+ ", r_uid=" + r_uid + "]";
	}
    
    

}