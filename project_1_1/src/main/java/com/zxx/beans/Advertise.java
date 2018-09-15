package com.zxx.beans;

public class Advertise {
	private int id;
	private int aId;
	private String aClass;
	private int aLength;
	private int aWidth;
	private String aUrl;
	private String aTime;
	private String aState;
	private String aPic;
	
	public Advertise() {
	}
	
	public Advertise(int id, int aId, String aClass, int aLength, int aWidth,
			String aUrl, String aTime, String aState, String aPic) {
		super();
		this.id = id;
		this.aId = aId;
		this.aClass = aClass;
		this.aLength = aLength;
		this.aWidth = aWidth;
		this.aUrl = aUrl;
		this.aTime = aTime;
		this.aState = aState;
		this.aPic = aPic;
	}

	public Advertise(int aId, String aClass, int aLength, int aWidth,
			String aUrl, String aTime, String aState, String aPic) {
		super();
		this.aId = aId;
		this.aClass = aClass;
		this.aLength = aLength;
		this.aWidth = aWidth;
		this.aUrl = aUrl;
		this.aTime = aTime;
		this.aState = aState;
		this.aPic = aPic;
	}
	public Advertise(int id,int aId, String aClass, int aLength, int aWidth,
			String aUrl, String aPic) {
		super();
		this.id = id;
		this.aId = aId;
		this.aClass = aClass;
		this.aLength = aLength;
		this.aWidth = aWidth;
		this.aUrl = aUrl;
		this.aPic = aPic;
	}
	public Advertise(int aId, String aClass, int aLength, int aWidth,
			String aUrl, String aPic) {
		super();
		this.aId = aId;
		this.aClass = aClass;
		this.aLength = aLength;
		this.aWidth = aWidth;
		this.aUrl = aUrl;
		this.aPic = aPic;
	}
	public Advertise(int aId, String aClass, int aLength, int aWidth,
			String aUrl, String aTime,String aPic) {
		super();
		this.aId = aId;
		this.aClass = aClass;
		this.aLength = aLength;
		this.aWidth = aWidth;
		this.aUrl = aUrl;
		this.aTime = aTime;
		this.aPic = aPic;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaClass() {
		return aClass;
	}

	public void setaClass(String aClass) {
		this.aClass = aClass;
	}

	public int getaLength() {
		return aLength;
	}

	public void setaLength(int aLength) {
		this.aLength = aLength;
	}

	public int getaWidth() {
		return aWidth;
	}

	public void setaWidth(int aWidth) {
		this.aWidth = aWidth;
	}

	public String getaUrl() {
		return aUrl;
	}

	public void setaUrl(String aUrl) {
		this.aUrl = aUrl;
	}

	public String getaTime() {
		return aTime;
	}

	public void setaTime(String aTime) {
		this.aTime = aTime;
	}

	public String getaState() {
		return aState;
	}

	public void setaState(String aState) {
		this.aState = aState;
	}

	public String getaPic() {
		return aPic;
	}

	public void setaPic(String aPic) {
		this.aPic = aPic;
	}
	
}
