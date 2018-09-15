package com.zxx.beans;
//订单，订单详情，商品
public class OOP {
	private int id;
	private int oid;
	private String otime;
	private String ostate;
	private String p_id;
	private String productname;
	private String originalprice;
	private String nowtheprice;
	private int onum;
	private String price;
	private String explain;
	private String waitpay;
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getWaitpay() {
		return waitpay;
	}
	public void setWaitpay(String waitpay) {
		this.waitpay = waitpay;
	}
	public OOP(int id, int oid, String otime, String ostate, String p_id,
			String productname, String originalprice, String nowtheprice,
			int onum, String price, String explain, String waitpay) {
		super();
		this.id = id;
		this.oid = oid;
		this.otime = otime;
		this.ostate = ostate;
		this.p_id = p_id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.onum = onum;
		this.price = price;
		this.explain = explain;
		this.waitpay = waitpay;
	}
	public OOP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OOP(int oid, String otime, String ostate, String p_id,
			String productname, String originalprice, String nowtheprice,
			int onum, String price) {
		super();
		this.oid = oid;
		this.otime = otime;
		this.ostate = ostate;
		this.p_id = p_id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.onum = onum;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OOP(int id, int oid, String otime, String ostate, String p_id,
			String productname, String originalprice, String nowtheprice,
			int onum, String price) {
		super();
		this.id = id;
		this.oid = oid;
		this.otime = otime;
		this.ostate = ostate;
		this.p_id = p_id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.onum = onum;
		this.price = price;
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
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getOriginalprice() {
		return originalprice;
	}
	public void setOriginalprice(String originalprice) {
		this.originalprice = originalprice;
	}
	public String getNowtheprice() {
		return nowtheprice;
	}
	public void setNowtheprice(String nowtheprice) {
		this.nowtheprice = nowtheprice;
	}
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OOP [id=" + id + ", oid=" + oid + ", otime=" + otime
				+ ", ostate=" + ostate + ", p_id=" + p_id + ", productname="
				+ productname + ", originalprice=" + originalprice
				+ ", nowtheprice=" + nowtheprice + ", onum=" + onum
				+ ", price=" + price + "]";
	}
	
	
	
}
