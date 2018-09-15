package com.zxx.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Advertise;
import com.zxx.service.AdvService;

@Controller
@RequestMapping("/adv")
public class AdvController {
	@Autowired 
	private AdvService advService;
	
	/**
	 	查询所有广告
	 */
	@RequestMapping("/selectAllAdv")
	public ModelAndView selectAll(){
		ModelAndView mv = new ModelAndView();
		List<Advertise> advList =advService.selectAll();
		System.out.println(advList);
		mv.addObject("advList",advList);
		mv.setViewName("adv_view/Ads_list");
		return mv;
	}
	
	/**
	 	添加广告
	 */
	@RequestMapping("/addAdv")
	public void upload(HttpServletRequest request,HttpServletResponse response,
			String aClass,
			int aId,
			int aLength,
			int aWidth,
			String aUrl,
			String aPic,
			String aTime) throws IOException {
		Date day = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Advertise adv = new Advertise(aId,aClass,aLength,aWidth, aUrl, df.format(day),"picture.path");
		boolean flag = advService.addAdv(adv);
		System.out.println(flag);
		String path = request.getContextPath();
		response.sendRedirect(path+"/adv/selectAllAdv");
	}
	
	/**
	 	删除广告
	 */
	@RequestMapping("/deleteAdv")
	public void deleteAdv(String id,HttpServletRequest request,HttpServletResponse response) throws IOException{
		String path = request.getContextPath();
		
		boolean flag = advService.deleteAdv(id);
		if(flag){
			response.sendRedirect(path+"/adv/selectAllAdv");
		}
	
	}

	@RequestMapping("/updateAdv")
	public void updateAdv(String aId,String aClass,String aLength,String aWidth,
			String aUrl,String aPic,HttpServletRequest request,HttpServletResponse response) throws IOException{
		String path=request.getContextPath();
		Advertise advertise = (Advertise) request.getSession().getAttribute("advertise");
		Advertise advertise2 = new Advertise(Integer.parseInt(aId), aClass, Integer.parseInt(aLength),Integer.parseInt(aWidth), aUrl, aPic);
		System.out.println(advertise2);
		boolean flag = advService.updateAdv(advertise2);
		if(flag){
			response.sendRedirect(path+"/adv/selectAllAdv");
		}
		
	}
}
