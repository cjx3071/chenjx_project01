package com.zxx.beans;

import java.util.List;

import javax.xml.registry.infomodel.User;

import org.springframework.stereotype.Controller;
@Controller
public class Order {
	private int id;
	private int oid;
	private String otime;
	private String ostate;
	private List<Orderdail> orderdail;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, int oid, String otime, String ostate,
			List<Orderdail> orderdail) {
		super();
		this.id = id;
		this.oid = oid;
		this.otime = otime;
		this.ostate = ostate;
		this.orderdail = orderdail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOtime() {
		return otime;
	}
	public void setOtime(String otime) {
		this.otime = otime;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	public List<Orderdail> getOrderdail() {
		return orderdail;
	}
	public void setOrderdail(List<Orderdail> orderdail) {
		this.orderdail = orderdail;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", oid=" + oid + ", otime=" + otime
				+ ", ostate=" + ostate + ", orderdail=" + orderdail + "]";
	}
	
	
}
