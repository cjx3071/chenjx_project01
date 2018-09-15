package com.zxx.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxx.beans.PageSupport;
import com.zxx.beans.Product;
import com.zxx.beans.Product_r;

public interface ProductService {
	
	//分页查询
	public List<Product> selectProducts(int startPos,int pageSize);
	
	//获取产品总数
	public int getProductsCount();
	
	//新增产品
	public int newGoods(Product product);
	
	//批量删除
	public int batchDelete(int[] id);
	
	//模糊查询
	public List<Product> fuzzyQueryByName(String productname);
	
	public List<Product> fuzzyQueryByTime(String jointime);
	
	//商品信息修改
	public int updateProductById(Product product);
	
	//根据Id删除
	public int delectById(int id);
	
	//根据ID查询状态
	public String stateOfTheQuery(int id);
	
	//根据ID修改状态
	public int modifyTheState(Product_r product_r);
}
