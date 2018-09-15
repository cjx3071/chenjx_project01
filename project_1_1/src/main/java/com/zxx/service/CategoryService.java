package com.zxx.service;

import java.util.List;

import com.zxx.beans.Category;


public interface CategoryService {
	//查询所有分类
	public List<Category> selectAllCategory();
	//根据id删除分类
	public boolean deleteCategoryById(int id);
}
