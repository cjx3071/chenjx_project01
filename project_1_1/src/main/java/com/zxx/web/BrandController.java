package com.zxx.web;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Brand;
import com.zxx.beans.PageSupport;
import com.zxx.beans.Product;
import com.zxx.service.BrandService;

@Controller
@RequestMapping("/bc")
public class BrandController {

	@Autowired
	BrandService bs;

	// 分页查询
	// http://localhost/project_1/index.jsp
	@RequestMapping("/pagingQuery")
	public ModelAndView pagingQuery(HttpServletRequest request) {
		int pageNow = 0;
		int totalCount = bs.getBrandsCount();
		PageSupport pageSupport = new PageSupport(totalCount, pageNow);
		int pageSize = pageSupport.getPageSize();
		int startPos = 0;

		ModelAndView mv = new ModelAndView();

		List<Brand> brandlist = bs.selectBrands(startPos, pageSize);
		mv.addObject("brandlist", brandlist);
		mv.setViewName("brand/Brand_Manage");

		return mv;
	}

	// 新增品牌（文件上传）
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(HttpServletRequest request,
			@RequestParam("branddescription") String branddescription,
			@RequestParam("brandimage") MultipartFile brandimage,
			@RequestParam("brandname") String brandname,
			@RequestParam("brandId") int brandId,
			@RequestParam("eachdistrict") String eachdistrict,
			@RequestParam("according") String according) {
		Date day = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("00");
		System.out.println(branddescription);
		Brand brand = new Brand(brandname, brandId,
				brandimage.getOriginalFilename(), eachdistrict,
				branddescription, according, df.format(day));

		int num = 0;
		// 如果文件不为空，写入上传路径
		if (!brandimage.isEmpty()) {
			// 上传文件路径
			String path = request.getServletContext().getRealPath("/loge/");
			// 上传文件名
			String filename = brandimage.getOriginalFilename();
			File filepath = new File(path, filename);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			try {
				brandimage
						.transferTo(new File(path + File.separator + filename));
			} catch (Exception e) {
				e.printStackTrace();
			}

			num = bs.upload(brand);

		}
		if (num != 1) {
			return "brand/Add_Brand";
		} else {
			return "home";
		}
	}
	
	//批量删除
	@RequestMapping("/batchDelete")
	public void batchDelete(@RequestParam(value = "s[]") int[] id){
		System.out.println(id);
		bs.batchDelete(id);
	}
	
	//修改商品详情页面
	@RequestMapping(value = "/updateBrandById", method = RequestMethod.POST)
	public String updateBrandById(HttpServletRequest request,
			@RequestParam("branddescription") String branddescription,
			@RequestParam("brandimage") MultipartFile brandimage,
			@RequestParam("brandname") String brandname,
			@RequestParam("brandId") int brandId,
			@RequestParam("eachdistrict") String eachdistrict,
			@RequestParam("according") String according){
		Date day = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Brand brand = new Brand(brandname, brandId,
				brandimage.getOriginalFilename(), eachdistrict,
				branddescription, according, df.format(day));

		int num = 0;
		// 如果文件不为空，写入上传路径
		if (!brandimage.isEmpty()) {
			// 上传文件路径
			String path = request.getServletContext().getRealPath("/loge/");
			// 上传文件名
			String filename = brandimage.getOriginalFilename();
			File filepath = new File(path, filename);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			try {
				brandimage
						.transferTo(new File(path + File.separator + filename));
			} catch (Exception e) {
				e.printStackTrace();
			}

			num = bs.updateBrandById(brand);

		}
		if (num != 1) {
			return "brand/Add_Brand";
		} else {
			return "brand/member_close";
		}		
	}
	
	//模糊查询
	@RequestMapping("/fuzzyQuery")
	public ModelAndView fuzzyQuery(HttpServletRequest request){
		String brandname=request.getParameter("brandname");
		String jointime=request.getParameter("jointime");
		System.out.println(jointime);
		System.out.println(brandname.length());
		List<Brand> brandlist=null;
		if (brandname.length()==0) {
			brandlist=bs.fuzzyQueryByTime(jointime);
		}else{
			brandlist=bs.fuzzyQueryByName(brandname);
		}
		ModelAndView mv=new ModelAndView();
		
		System.out.println(brandlist);
		mv.addObject("brandlist",brandlist);
		mv.setViewName("brand/Brand_Manage");
		
		return mv;
	}
	
	//根据ID删除
	@RequestMapping("/delectById")
	public void delectById(@RequestParam("brandId")int brandId){
		bs.delectById(brandId);
	}

}
