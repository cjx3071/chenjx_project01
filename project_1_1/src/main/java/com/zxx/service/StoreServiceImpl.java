package com.zxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Store;
import com.zxx.dao.StoreDao;

@Service("storeService")
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreDao storeDao;
	
	@Override
	public List<Store> selectAllStore() {
		// TODO Auto-generated method stub
		return storeDao.selectAllStore();
	}

	@Override
	public List<Store> selectStore(String sstate) {
		// TODO Auto-generated method stub
		return storeDao.selectStore(sstate);
	}

	
	@Override
	public Store selectStoreById(int sid) {
		// TODO Auto-generated method stub
		return storeDao.selectStoreById(sid);
	}

	@Override
	public int insertStore(Store store) {
		// TODO Auto-generated method stub
		return storeDao.insertStore(store);
	}

	@Override
	public int updateStoreById(Store store) {
		// TODO Auto-generated method stub
		return storeDao.updateStoreById(store);
	}

	@Override
	public int deleteStoreById(int sid) {
		// TODO Auto-generated method stub
		return storeDao.deleteStoreById(sid);
	}


}
