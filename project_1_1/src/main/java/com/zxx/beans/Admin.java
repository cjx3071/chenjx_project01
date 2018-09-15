package com.zxx.beans;

public class Admin {
	private int a_id;
	private String a_username;
	private String a_password;
	private String a_sex;
	private int a_age;
	private String a_mobilePhone;
	private String a_email;
	private String a_qq;
	private String a_grade;
	private String a_registerTime;
	
	public Admin() {
		super();
	}

	public Admin(int a_id, String a_username, String a_password, String a_sex,
			int a_age, String a_mobilePhone, String a_email, String a_qq,
			String a_grade, String a_registerTime) {
		super();
		this.a_id = a_id;
		this.a_username = a_username;
		this.a_password = a_password;
		this.a_sex = a_sex;
		this.a_age = a_age;
		this.a_mobilePhone = a_mobilePhone;
		this.a_email = a_email;
		this.a_qq = a_qq;
		this.a_grade = a_grade;
		this.a_registerTime = a_registerTime;
	}
	public Admin( String a_username, String a_password, String a_sex,
			int a_age, String a_mobilePhone, String a_email, String a_qq,
			String a_grade, String a_registerTime) {
		super();
		this.a_username = a_username;
		this.a_password = a_password;
		this.a_sex = a_sex;
		this.a_age = a_age;
		this.a_mobilePhone = a_mobilePhone;
		this.a_email = a_email;
		this.a_qq = a_qq;
		this.a_grade = a_grade;
		this.a_registerTime = a_registerTime;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_username() {
		return a_username;
	}

	public void setA_username(String a_username) {
		this.a_username = a_username;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}

	public String getA_sex() {
		return a_sex;
	}

	public void setA_sex(String a_sex) {
		this.a_sex = a_sex;
	}

	public int getA_age() {
		return a_age;
	}

	public void setA_age(int a_age) {
		this.a_age = a_age;
	}

	public String getA_mobilePhone() {
		return a_mobilePhone;
	}

	public void setA_mobilePhone(String a_mobilePhone) {
		this.a_mobilePhone = a_mobilePhone;
	}

	public String getA_email() {
		return a_email;
	}

	public void setA_email(String a_email) {
		this.a_email = a_email;
	}

	public String getA_qq() {
		return a_qq;
	}

	public void setA_qq(String a_qq) {
		this.a_qq = a_qq;
	}

	public String getA_grade() {
		return a_grade;
	}

	public void setA_grade(String a_grade) {
		this.a_grade = a_grade;
	}

	public String getA_registerTime() {
		return a_registerTime;
	}

	public void setA_registerTime(String a_registerTime) {
		this.a_registerTime = a_registerTime;
	}

	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", a_username=" + a_username
				+ ", a_password=" + a_password + ", a_sex=" + a_sex
				+ ", a_age=" + a_age + ", a_mobilePhone=" + a_mobilePhone
				+ ", e_mail=" + a_email + ", a_qq=" + a_qq + ", a_grade="
				+ a_grade + ", a_registerTime=" + a_registerTime + "]";
	}
	
	

}
