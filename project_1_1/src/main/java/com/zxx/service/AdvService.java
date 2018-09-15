package com.zxx.service;

import java.util.List;

import com.zxx.beans.Advertise;

public interface AdvService {
	public List<Advertise> selectAll();
	
	public boolean addAdv(Advertise adv);
	
	public boolean deleteAdv(String id);
	
	public boolean updateAdv(Advertise adv);
	
}
