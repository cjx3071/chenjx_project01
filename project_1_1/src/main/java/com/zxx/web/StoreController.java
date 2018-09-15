package com.zxx.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Store;
import com.zxx.service.StoreService;



@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	@RequestMapping("/selectadoptStore")
	public ModelAndView selectadoptStore(){
		ModelAndView mv=new ModelAndView();
		String sstate="通过";
		List<Store> storeList=storeService.selectStore(sstate);
		System.out.println(storeList);
		mv.addObject("storeList",storeList);
		mv.setViewName("Storeview/Shop_list");
		return mv;
	}
	
	
	@RequestMapping("/selectauditStore")
	public ModelAndView selectexamineStore(){
		ModelAndView mv=new ModelAndView();
		String sstate="待审核";
		List<Store> storeList=storeService.selectStore(sstate);
		System.out.println(storeList);
		mv.addObject("storeList",storeList);
		mv.setViewName("Storeview/Shops_Audit");
		return mv;
	}
	
	
	
	@RequestMapping("/selectStoreById")
	public ModelAndView selectStoreById(int sid){
		ModelAndView mv=new ModelAndView();
		Store store=storeService.selectStoreById(sid);
		System.out.println(store);
		mv.addObject("store",store);
		mv.setViewName("Storeview/shopping_detailed");
		return mv;
	}

}
