package com.zxx.web;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Category;
import com.zxx.service.CategoryService;
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService cs;
	@RequestMapping("/selectAllCategory")
	public ModelAndView selectAllCategory() {
		ModelAndView mv = new ModelAndView();
		List<Category> categoryList = cs.selectAllCategory();
		mv.addObject("categoryList", categoryList);
		mv.setViewName("article_view/article_Sort");
		return mv;
	}
	
	@RequestMapping("/deleteCategoryById")
	public void deleteCategoryById(int id) {
		cs.deleteCategoryById(id);
	}

}
