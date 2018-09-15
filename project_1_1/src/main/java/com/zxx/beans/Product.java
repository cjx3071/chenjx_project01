package com.zxx.beans;

import org.springframework.stereotype.Controller;

@Controller
public class Product {
	//产品编号
	private int id;
	//简略标题
	private String productname;
	//原价格
	private int originalprice;
	//现价格
	private int nowtheprice;
	//产地
	private String eachdistrict;
	//加入时间
	private String jointime;
	//产品状态
	private String reviewthestatus;
	//材质
	private String material;
	//品牌
	private String brand;
	//产品重量
	private int weight;
	//关键词
	private String keywords;
	
	public Product() {
		super();
	}

	public Product(int id, String productname, int originalprice,
			int nowtheprice, String eachdistrict, String jointime,
			String reviewthestatus) {
		super();
		this.id = id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.eachdistrict = eachdistrict;
		this.jointime = jointime;
		this.reviewthestatus = reviewthestatus;
	}
	
	public Product(int id, String productname, int originalprice,
			int nowtheprice, String eachdistrict, String jointime,
			String reviewthestatus, String material, String brand, int weight,
			String keywords) {
		super();
		this.id = id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.eachdistrict = eachdistrict;
		this.jointime = jointime;
		this.reviewthestatus = reviewthestatus;
		this.material = material;
		this.brand = brand;
		this.weight = weight;
		this.keywords = keywords;
	}
	public Product(int id, String productname, int originalprice,
			int nowtheprice, String eachdistrict, String reviewthestatus,
			String material, String brand, int weight, String keywords) {
		super();
		this.id = id;
		this.productname = productname;
		this.originalprice = originalprice;
		this.nowtheprice = nowtheprice;
		this.eachdistrict = eachdistrict;
		this.reviewthestatus = reviewthestatus;
		this.material = material;
		this.brand = brand;
		this.weight = weight;
		this.keywords = keywords;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(int originalprice) {
		this.originalprice = originalprice;
	}

	public int getNowtheprice() {
		return nowtheprice;
	}

	public void setNowtheprice(int nowtheprice) {
		this.nowtheprice = nowtheprice;
	}

	public String getEachdistrict() {
		return eachdistrict;
	}

	public void setEachdistrict(String eachdistrict) {
		this.eachdistrict = eachdistrict;
	}

	public String getJointime() {
		return jointime;
	}

	public void setJointime(String jointime) {
		this.jointime = jointime;
	}

	public String getReviewthestatus() {
		return reviewthestatus;
	}

	public void setReviewthestatus(String reviewthestatus) {
		this.reviewthestatus = reviewthestatus;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname
				+ ", originalprice=" + originalprice + ", nowtheprice="
				+ nowtheprice + ", eachdistrict=" + eachdistrict
				+ ", jointime=" + jointime + ", reviewthestatus="
				+ reviewthestatus + ", material=" + material + ", brand="
				+ brand + ", weight=" + weight + ", keywords=" + keywords + "]";
	}
	
}
