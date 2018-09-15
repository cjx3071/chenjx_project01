package com.zxx.dao;

import java.util.List;

import com.zxx.beans.Advertise;

public interface AdvertiseDao {
	public List<Advertise> selectAll();
	
	public int addAdv(Advertise advertise);
	
	public int deleteAdv(String id);
	
	public int updateAdv(Advertise advertise);
	
}
