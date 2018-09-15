package com.zxx.beans;

public class LoginRecord {
	private int l_id;
	private int l_type;
	private String l_content;
	private String l_address;
	private String l_adminname;
	private String l_ip;
	private String l_time;
	
	public LoginRecord() {
		super();
	}

	public LoginRecord(int l_id, int l_type, String l_content,
			String l_address, String l_adminname, String l_ip, String l_time) {
		super();
		this.l_id = l_id;
		this.l_type = l_type;
		this.l_content = l_content;
		this.l_address = l_address;
		this.l_adminname = l_adminname;
		this.l_ip = l_ip;
		this.l_time = l_time;
	}

	public LoginRecord(int l_type, String l_content, String l_address,
			String l_adminname, String l_ip, String l_time) {
		super();
		this.l_type = l_type;
		this.l_content = l_content;
		this.l_address = l_address;
		this.l_adminname = l_adminname;
		this.l_ip = l_ip;
		this.l_time = l_time;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public int getL_type() {
		return l_type;
	}

	public void setL_type(int l_type) {
		this.l_type = l_type;
	}

	public String getL_content() {
		return l_content;
	}

	public void setL_content(String l_content) {
		this.l_content = l_content;
	}

	public String getL_address() {
		return l_address;
	}

	public void setL_address(String l_address) {
		this.l_address = l_address;
	}

	public String getL_adminname() {
		return l_adminname;
	}

	public void setL_adminname(String l_adminname) {
		this.l_adminname = l_adminname;
	}

	public String getL_ip() {
		return l_ip;
	}

	public void setL_ip(String l_ip) {
		this.l_ip = l_ip;
	}

	public String getL_time() {
		return l_time;
	}

	public void setL_time(String l_time) {
		this.l_time = l_time;
	}

	@Override
	public String toString() {
		return "LoginRecord [l_id=" + l_id + ", l_type=" + l_type
				+ ", l_content=" + l_content + ", l_address=" + l_address
				+ ", l_adminname=" + l_adminname + ", l_ip=" + l_ip
				+ ", l_time=" + l_time + "]";
	}

	
	
	

}
