package com.zxx.beans;

import java.util.Date;

public class Message {
	private int id;
	private String m_uname;
	private String mcontent;
	private Date mtime;
	private String mstate;
	public Message() {
		super();
	}
	public Message(int id, String m_uname, String mcontent, Date mtime,
			String mstate) {
		super();
		this.id = id;
		this.m_uname = m_uname;
		this.mcontent = mcontent;
		this.mtime = mtime;
		this.mstate = mstate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getM_uname() {
		return m_uname;
	}
	public void setM_uname(String m_uname) {
		this.m_uname = m_uname;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcountent) {
		this.mcontent = mcountent;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public String getMstate() {
		return mstate;
	}
	public void setMstate(String mstate) {
		this.mstate = mstate;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", m_uname=" + m_uname + ", mcountent="
				+ mcontent + ", mtime=" + mtime + ", mstate=" + mstate + "]";
	}
	
}
