package com.zxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxx.beans.Brand;
import com.zxx.beans.Product;

public interface BrandDao {

	public List<Brand> selectBrands(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public int getBrandsCount();
	
	public int upload(Brand brand);
	
	public int batchDelete(int[] id);
	
	public int updateBrandById(Brand brand);
	
	public List<Brand> fuzzyQueryByName(@Param(value="brandname") String brandname);
	
	public List<Brand> fuzzyQueryByTime(@Param(value="jointime") String jointime);
	
	public int delectById(int brandId);
	
}
