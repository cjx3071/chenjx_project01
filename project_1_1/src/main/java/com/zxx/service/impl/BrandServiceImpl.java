package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Brand;
import com.zxx.beans.Product;
import com.zxx.dao.BrandDao;
import com.zxx.dao.ProductDao;
import com.zxx.service.BrandService;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDao bd;

	@Override
	public List<Brand> selectBrands(int startPos,int pageSize) {
		return bd.selectBrands(startPos,pageSize);
	}

	@Override
	public int getBrandsCount() {
		return bd.getBrandsCount();
	}

	@Override
	public int upload(Brand brand) {
		return bd.upload(brand);
	}

	@Override
	public int batchDelete(int[] id) {
		return bd.batchDelete(id);
	}

	@Override
	public int updateBrandById(Brand brand) {
		return bd.updateBrandById(brand);
	}

	@Override
	public List<Brand> fuzzyQueryByName(String brandname) {
		return bd.fuzzyQueryByName(brandname);
	}

	@Override
	public List<Brand> fuzzyQueryByTime(String jointime) {
		return bd.fuzzyQueryByTime(jointime);
	}

	@Override
	public int delectById(int brandId) {
		return bd.delectById(brandId);
	}



}
