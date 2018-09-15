package com.zxx.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.PageSupport;
import com.zxx.beans.Product;
import com.zxx.beans.Product_r;
import com.zxx.dao.ProductDao;
import com.zxx.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pd;

	@Override
	public List<Product> selectProducts(int startPos,int pageSize) {
		return pd.selectProducts(startPos,pageSize);
	}

	@Override
	public int getProductsCount() {
		return pd.getProductsCount();
	}

	@Override
	public int newGoods(Product product) {
		return pd.newGoods(product);
	}

	@Override
	public int batchDelete(int[] id) {
		return pd.batchDelete(id);
	}

	@Override
	public List<Product> fuzzyQueryByName(String productname) {
		return pd.fuzzyQueryByName(productname);
	}

	@Override
	public List<Product> fuzzyQueryByTime(String jointime) {
		return pd.fuzzyQueryByTime(jointime);
	}

	@Override
	public int updateProductById(Product product) {
		return pd.updateProductById(product);
	}

	@Override
	public int delectById(int id) {
		return pd.delectById(id);
	}

	@Override
	public String stateOfTheQuery(int id) {
		return pd.stateOfTheQuery(id);
	}

	@Override
	public int modifyTheState(Product_r product_r) {
		return pd.modifyTheState(product_r);
	}

}
