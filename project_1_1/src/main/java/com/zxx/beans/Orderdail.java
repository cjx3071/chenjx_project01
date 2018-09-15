package com.zxx.beans;

import org.springframework.stereotype.Controller;

@Controller
public class Orderdail {
	private int id;
	private int o_oid;
	private int p_pid;
	private int onum;
	private Product product;
	public Orderdail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orderdail(int id, int o_oid, int p_pid, int onum, Product product) {
		super();
		this.id = id;
		this.o_oid = o_oid;
		this.p_pid = p_pid;
		this.onum = onum;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getO_oid() {
		return o_oid;
	}
	public void setO_oid(int o_oid) {
		this.o_oid = o_oid;
	}
	public int getP_pid() {
		return p_pid;
	}
	public void setP_pid(int p_pid) {
		this.p_pid = p_pid;
	}
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Orderdail [id=" + id + ", o_oid=" + o_oid + ", p_pid=" + p_pid
				+ ", onum=" + onum + ", product=" + product + "]";
	}
	
	
	
}
