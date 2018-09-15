package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Advertise;
import com.zxx.dao.AdvertiseDao;
import com.zxx.service.AdvService;

@Service
public class AdvServiceImpl implements AdvService {
	
	@Autowired
	private AdvertiseDao ad;
	/**
		查询所有广告
	*/
	@Override
	public List<Advertise> selectAll() {
		return ad.selectAll();
	}
	/**
	 	添加广告
	 * @return 
	*/
	@Override
	public boolean addAdv(Advertise adv) {
		boolean flag=false;
		int i =ad.addAdv(adv);
		if(i>0){
			flag=true;
		}
		return flag;
	}
	/**
		删除广告
	*/
	@Override
	public boolean deleteAdv(String id) {
		boolean flag=false;
		int i =ad.deleteAdv(id);
		if(i>0){
			flag=true;
		}
		return flag;	
	}

	/**
		修改广告
	*/
	@Override
	public boolean updateAdv(Advertise adv) {
		boolean flag=false;
		int i =ad.updateAdv(adv);
		if(i>0){
			flag=true;
		}
		return flag;
	}
}
	

