package com.zxx.beans;

import org.springframework.stereotype.Controller;


@Controller
public class Brand {
	private String brandname;
	private int brandId;
	private String brandimage;
	private String eachdistrict;
	private String branddescription;
	private String according;
	private String jointime;
	
	public Brand() {
		super();
	}

	public Brand(String brandname, int brandId, String brandimage,
			String eachdistrict, String branddescription) {
		super();
		this.brandname = brandname;
		this.brandId = brandId;
		this.brandimage = brandimage;
		this.eachdistrict = eachdistrict;
		this.branddescription = branddescription;
	}

	public Brand(String brandname, int brandId, String brandimage,
			String eachdistrict, String branddescription, String according,
			String jointime) {
		super();
		this.brandname = brandname;
		this.brandId = brandId;
		this.brandimage = brandimage;
		this.eachdistrict = eachdistrict;
		this.branddescription = branddescription;
		this.according = according;
		this.jointime = jointime;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandimage() {
		return brandimage;
	}

	public void setBrandimage(String brandimage) {
		this.brandimage = brandimage;
	}

	public String getEachdistrict() {
		return eachdistrict;
	}

	public void setEachdistrict(String eachdistrict) {
		this.eachdistrict = eachdistrict;
	}

	public String getBranddescription() {
		return branddescription;
	}

	public void setBranddescription(String branddescription) {
		this.branddescription = branddescription;
	}

	public String getAccording() {
		return according;
	}

	public void setAccording(String according) {
		this.according = according;
	}

	public String getJointime() {
		return jointime;
	}

	public void setJointime(String jointime) {
		this.jointime = jointime;
	}

	@Override
	public String toString() {
		return "Brand [brandname=" + brandname + ", brandId=" + brandId
				+ ", brandimage=" + brandimage + ", eachdistrict="
				+ eachdistrict + ", branddescription=" + branddescription
				+ ", according=" + according + ", jointime=" + jointime + "]";
	}
	
	
}
