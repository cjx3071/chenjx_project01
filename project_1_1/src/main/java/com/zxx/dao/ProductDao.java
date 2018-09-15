package com.zxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxx.beans.Product;
import com.zxx.beans.Product_r;

public interface ProductDao {

	public List<Product> selectProducts(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public int getProductsCount();
	
	public int newGoods(Product product);
	
	public int batchDelete(int[] id);
	
	public List<Product> fuzzyQueryByName(@Param(value="productname") String productname);
	
	public List<Product> fuzzyQueryByTime(@Param(value="jointime") String jointime);
	
	public int updateProductById(Product product);
	
	public int delectById(int id);
	
	public String stateOfTheQuery(int id);
	
	public int modifyTheState(Product_r product_r);
}
