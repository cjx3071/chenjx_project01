package com.zxx.beans;

import org.springframework.stereotype.Controller;

@Controller
public class Product_r {
	private String reviewthestatus;
	private int id;
	
	public Product_r() {
		super();
	}

	public Product_r(String reviewthestatus, int id) {
		super();
		this.reviewthestatus = reviewthestatus;
		this.id = id;
	}

	public String getReviewthestatus() {
		return reviewthestatus;
	}

	public void setReviewthestatus(String reviewthestatus) {
		this.reviewthestatus = reviewthestatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product_r [reviewthestatus=" + reviewthestatus + ", id=" + id
				+ "]";
	}
	
	
	
}
