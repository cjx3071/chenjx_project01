package com.zxx.service;

import java.util.List;

import com.zxx.beans.Brand;
import com.zxx.beans.Product;

public interface BrandService {
	
	//分页查询
	public List<Brand> selectBrands(int startPos,int pageSize);
	
	//获取品牌总数
	public int getBrandsCount();
	
	//新增品牌
	public int upload(Brand brand);
	
	//批量删除
	public int batchDelete(int[] id);
	
	//修改品牌
	public int updateBrandById(Brand brand);
	
	//模糊查询
	public List<Brand> fuzzyQueryByName(String brandname);
	
	public List<Brand> fuzzyQueryByTime(String jointime);
	
	//根据Id删除
	public int delectById(int brandId);
}
