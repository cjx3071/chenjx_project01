package com.zxx.dao;

import java.util.List;

import com.zxx.beans.Store;


public interface StoreDao {
	public List<Store> selectAllStore();
	
	public List<Store> selectStore(String sstate);

	public Store selectStoreById(int sid);

	public int insertStore(Store store);

	public int updateStoreById(Store store);

	public int deleteStoreById(int sid);

}
