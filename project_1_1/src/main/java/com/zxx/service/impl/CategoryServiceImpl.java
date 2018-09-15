package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Category;
import com.zxx.dao.CategoryDao;
import com.zxx.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService {

	@Autowired
	private CategoryDao cd;
	
	@Override
	public List<Category> selectAllCategory() {
		return cd.selectAllCategory();
	}

	@Override
	public boolean deleteCategoryById(int id) {
		if (cd.deleteCategoryById(id)>0) {
			return true;
		}
		return false;
	}

	
	
}
