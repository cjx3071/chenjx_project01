package com.zxx.dao;

import java.util.List;

import com.zxx.beans.Category;

public interface CategoryDao {
	//查询所有分类
	public List<Category> selectAllCategory();
	//根据id删除分类
	public int deleteCategoryById(int id);
}
