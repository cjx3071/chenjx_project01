package com.zxx.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.PageSupport;
import com.zxx.beans.Product;
import com.zxx.beans.Product_r;
import com.zxx.service.ProductService;

@Controller
@RequestMapping("/pc")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	//分页查询
	//http://localhost/project_1/index.jsp
	@RequestMapping("/pagingQuery")
	public ModelAndView pagingQuery(HttpServletRequest request){
		int pageNow=0;
		int totalCount=ps.getProductsCount();
		PageSupport pageSupport=new PageSupport(totalCount,pageNow);
		int pageSize=pageSupport.getPageSize();
		int startPos=0;
		
		ModelAndView mv=new ModelAndView();
		
		List<Product> productlist=ps.selectProducts(startPos,pageSize);
		mv.addObject("productlist",productlist);
		mv.setViewName("product/Products_List");
		
		return mv;
	}
	
	//新增商品
	@RequestMapping("/newGoods")
	public ModelAndView newGoods(Product p){
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(df.format(day));   
		
		Product product=new Product(p.getId(), p.getProductname(), p.getOriginalprice(), p.getNowtheprice(), p.getEachdistrict(),
				df.format(day), p.getReviewthestatus(), p.getMaterial(), p.getBrand(), p.getWeight(), p.getKeywords());
		
		
		int num=ps.newGoods(product);
		
		ModelAndView mv=new ModelAndView();
		
		if (num==1) {
			mv.setViewName("home");
		}else {
			mv.setViewName("product/picture-add");
		}
		return mv;
	}
	
	//批量删除
	@RequestMapping("/batchDelete")
	public void batchDelete(@RequestParam(value = "s[]") int[] id){
		ps.batchDelete(id);
	}
	
	//模糊查询
	@RequestMapping("/fuzzyQuery")
	public ModelAndView fuzzyQuery(HttpServletRequest request){
		String productname=request.getParameter("productname");
		String jointime=request.getParameter("jointime");
		System.out.println(jointime);
		System.out.println(productname.length());
		List<Product> productlist=null;
		if (productname.length()==0) {
			productlist=ps.fuzzyQueryByTime(jointime);
		}else{
			productlist=ps.fuzzyQueryByName(productname);
		}
		ModelAndView mv=new ModelAndView();
		
		System.out.println(productlist);
		mv.addObject("productlist",productlist);
		mv.setViewName("product/Products_List");
		
		return mv;
	}
	
	//修改商品详情页面
	@RequestMapping("/updateProductById")
	public ModelAndView updateProductById(Product product){
		System.out.println(product);
		int num=ps.updateProductById(product);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product/member_close");
		return mv;
		
	}
	
	//根据ID删除
	@RequestMapping("/delectById")
	public void delectById(@RequestParam("id")int id){
		ps.delectById(id);
	}
	
	//启用&停用 enableDisable
	@RequestMapping("/enableDisable")
	public void enableDisable(@RequestParam("id")int id){
		String  s=ps.stateOfTheQuery(id);
		System.out.println(s);
		if ("已启用".equals(s)) {
			Product_r p=new Product_r("已停用", id);
			ps.modifyTheState(p);
		}else {
			Product_r p=new Product_r("已启用", id);
			ps.modifyTheState(p);
		}
	}
	
	@RequestMapping("/forpagingQuery")
	public ModelAndView forpagingQuery(HttpServletRequest request){
		int pageNow=0;
		int totalCount=ps.getProductsCount();
		PageSupport pageSupport=new PageSupport(totalCount,pageNow);
		int pageSize=pageSupport.getPageSize();
		int startPos=0;
		
		ModelAndView mv=new ModelAndView();
		
		List<Product> productlist=ps.selectProducts(startPos,pageSize);
		mv.addObject("productlist",productlist);
		mv.setViewName("brand/Brand_detailed");
		
		return mv;
	}
	
}



















