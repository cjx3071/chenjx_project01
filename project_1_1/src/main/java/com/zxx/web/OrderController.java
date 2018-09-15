package com.zxx.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.junit.runners.ParentRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.OOP;
import com.zxx.beans.Order;
import com.zxx.service.impl.OrderServiceImpl;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl osi;
	//查询所用订单
	@RequestMapping("/testSelectAllOrder")
	public ModelAndView testSelectAllOrder(){
		ModelAndView mv=new ModelAndView();
		List<Order> orderlist=osi.selectAllOrder();
		System.out.println(orderlist);
		mv.addObject("orderlist", orderlist);
		mv.setViewName("order/Orderform");
		return mv;
	}
	
	//根据id,时间模糊查询订单
	@RequestMapping("/selectOrderById")
	public ModelAndView selectOrderById(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String sid=request.getParameter("order_id");
		String otime=request.getParameter("otime");
		System.out.println(otime.length());
		
		if(sid.length()>0){
			Integer id=Integer.parseInt(sid);
			List orderlist=osi.selectOrderById(id);
			mv.addObject("orderlist",orderlist);
		}
		
		if(otime.length()>0){
			List orderlist=osi.selectOrderByOtime(otime);
			mv.addObject("orderlist",orderlist);
		}
		mv.setViewName("order/Orderform");
		return mv;
	}
	
	//查询订单详情
	@RequestMapping("/selectDail")
	public ModelAndView selectDail(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String sid=request.getParameter("id");
		Integer id=Integer.parseInt(sid);
		System.out.println(id);
		List ooplist=osi.selectDail(id);
		int total=0;
		if(ooplist.size()>1){
			for(int i=0;i<ooplist.size();i++){
				OOP oop=(OOP)ooplist.get(i);
				Integer price=Integer.parseInt(oop.getPrice());
				total+=price;
			}
		}else{
			OOP oop = (OOP)ooplist.get(0);
			Integer price=Integer.parseInt(oop.getPrice());
			total+=price;
		}
		System.out.println(total);
		mv.addObject("ooplist", ooplist);
		mv.addObject("total", total);
		mv.setViewName("order/order_detailed");
		return mv;
	}
	
	//根据id删除订单
	@RequestMapping("/deleteOrderByid")
	public ModelAndView deleteOrderByid(int id){
		ModelAndView mv=new ModelAndView();
		System.out.println(id);
		int num=osi.deleteOrderByid(id);
		System.out.println(num);
		return mv; 
	}
	
	//更改订单
	@RequestMapping("/updateOrderByid")
	public void updateOrderByid(int id){
		System.out.println(id);
		int num=osi.updateOrder(id);
		System.out.println(num);
	}
	
	//交易订单查询
	@RequestMapping("/selectAllOrder")
	public ModelAndView selectAllOrder(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String otime=sdf.format(date);
		System.out.println(otime);
		ModelAndView mv=new ModelAndView();
		
		List orderlist=osi.selectAllOOP();
		int allmoney=osi.selectAccount();
		int todaymoney=osi.selectTodayMoney(otime);
		int successOrder =osi.selectSuccessOrder();
		System.out.println(allmoney);
		System.out.println(orderlist);
		
		mv.addObject("orderlist", orderlist);
		mv.addObject("allmoney", allmoney);
		mv.addObject("todaymoney", todaymoney);
		mv.addObject("otime", otime);
		mv.addObject("successOrder", successOrder);
		mv.setViewName("order/Amounts");
		return mv;
	}
	
	//当天订单查询
	@RequestMapping("/selectTodayOrder")
	public ModelAndView selectTodayOrder(){
		ModelAndView mv=new ModelAndView();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String otime=sdf.format(date);
		
		List orderlist=osi.selectTodayOrder(otime);
		int allmoney=osi.selectAccount();
		int todaymoney=osi.selectTodayMoney(otime);
		int successOrder=osi.selectTodayAccount(otime);
		
		System.out.println(orderlist.size());
		mv.addObject("orderlist", orderlist);
		mv.addObject("allmoney", allmoney);
		mv.addObject("otime", otime);
		mv.addObject("todaymoney", todaymoney);
		mv.addObject("successOrder", successOrder);
		mv.setViewName("order/Amounts");
		return mv;
	}
	
	//查询当月的订单
	@RequestMapping("/selectMonthOrder")
	public ModelAndView selectMonthOrder(){
		ModelAndView mv =new ModelAndView();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		String otime1=sdf.format(date);
		String otime2=sdf2.format(date);
		
		List orderlist=osi.selectMonthOrder(otime1);
		int allmoney=osi.selectAccount();
		int todaymoney=osi.selectTodayMoney(otime2);
		int successOrder=osi.selectMonthAccount(otime1);
		mv.addObject("orderlist", orderlist);
		mv.addObject("allmoney", allmoney);
		mv.addObject("otime", otime2);
		mv.addObject("todaymoney", todaymoney);
		mv.addObject("successOrder", successOrder);
		mv.setViewName("order/Amounts");
		return mv;
	}
	
/*	订单处理，此内容与订单管理一样，只不过mv返回的视图不一样----------------------    */
	@RequestMapping("/testSelectAllOrder2")
	public ModelAndView testSelectAllOrder2(){
		ModelAndView mv=new ModelAndView();
		List<Order> orderlist=osi.selectAllOrder();
		System.out.println(orderlist);
		mv.addObject("orderlist", orderlist);
		mv.setViewName("order/Order_handing");
		return mv;
	}
	
	//根据id,时间模糊查询订单
	@RequestMapping("/selectOrderById2")
	public ModelAndView selectOrderById2(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String sid=request.getParameter("order_id");
		String otime=request.getParameter("otime");
		System.out.println(otime.length());
		
		if(sid.length()>0){
			Integer id=Integer.parseInt(sid);
			List orderlist=osi.selectOrderById(id);
			mv.addObject("orderlist",orderlist);
		}
		
		if(otime.length()>0){
			List orderlist=osi.selectOrderByOtime(otime);
			mv.addObject("orderlist",orderlist);
		}
		mv.setViewName("order/Order_handing");
		return mv;
	}
	
	//查询订单详情
	@RequestMapping("/selectDail2")
	public ModelAndView selectDail2(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String sid=request.getParameter("id");
		System.out.println(sid);
		Integer id=Integer.parseInt(sid);
		
		List ooplist2=osi.selectDail(id);
		int total=0;
		if(ooplist2.size()>1){
			for(int i=0;i<ooplist2.size();i++){
				OOP oop=(OOP)ooplist2.get(i);
				Integer price=Integer.parseInt(oop.getPrice());
				total+=price;
			}
		}else{
			OOP oop = (OOP)ooplist2.get(0);
			System.out.println(oop);
			Integer price=Integer.parseInt(oop.getPrice());
			total+=price;
		}
		System.out.println(total);
		mv.addObject("ooplist2", ooplist2);
		mv.addObject("total", total);
		mv.setViewName("order/order_detailed2");
		return mv;
	}
	
	/*//根据id删除订单
	@RequestMapping("/deleteOrderByid2")
	public ModelAndView deleteOrderByid2(int id){
		ModelAndView mv=new ModelAndView();
		System.out.println(id);
		int num=osi.deleteOrderByid(id);
		System.out.println(num);
		return mv; 
	}
	
	//更改订单
	@RequestMapping("/updateOrderByid2")
	public void updateOrderByid2(int id){
		System.out.println(id);
		int num=osi.updateOrder(id);
		System.out.println(num);
	}*/
	
	//查询交易失败的订单
	@RequestMapping("/selectBadOrder")
	public ModelAndView selectBadOrder(){
		ModelAndView mv=new ModelAndView();
		List ooplist=osi.selectBadOrder();
		mv.addObject("orderlist", ooplist);
		mv.setViewName("order/Refund");
		return mv;
	}
	
	//更改交易失败的订单，退款
	@RequestMapping("/updateBadOrder")
	public void updateBadOrder(int id){
		System.out.println(id);
		int num=osi.updateBadOrder(id);
		System.out.println(num);
	}
	
	//查询订单详情
		@RequestMapping("/selectDail3")
		public ModelAndView selectDail3(HttpServletRequest request){
			ModelAndView mv=new ModelAndView();
			String sid=request.getParameter("id");
			System.out.println(sid);
			Integer id=Integer.parseInt(sid);
			
			List ooplist2=osi.selectDail(id);
			int total=0;
			if(ooplist2.size()>1){
				for(int i=0;i<ooplist2.size();i++){
					OOP oop=(OOP)ooplist2.get(i);
					Integer price=Integer.parseInt(oop.getPrice());
					total+=price;
				}
			}else{
				OOP oop = (OOP)ooplist2.get(0);
				System.out.println(oop);
				Integer price=Integer.parseInt(oop.getPrice());
				total+=price;
			}
			System.out.println(total);
			mv.addObject("ooplist2", ooplist2);
			mv.addObject("total", total);
			mv.setViewName("order/order_detailed3");
			return mv;
		}
	
		//根据id,时间模糊查询订单
		@RequestMapping("/selectOrderById3")
		public ModelAndView selectOrderById3(HttpServletRequest request){
			ModelAndView mv=new ModelAndView();
			String sid=request.getParameter("order_id");
			String otime=request.getParameter("otime");
			System.out.println(otime.length());
			
			if(sid.length()>0){
				Integer id=Integer.parseInt(sid);
				List orderlist=osi.selectBadOrderByid(id);
				mv.addObject("orderlist",orderlist);
			}
			
			if(otime.length()>0){
				List orderlist=osi.selectBadOrderByOtime(otime);
				mv.addObject("orderlist",orderlist);
			}
			mv.setViewName("order/Refund");
			return mv;
		}
		
		//根据已退款查询订单
		@RequestMapping("/selectBadOrderBypay")
		public ModelAndView selectBadOrderBypay(){
			ModelAndView mv=new ModelAndView();
			List orderlist=osi.selectBadOrderBypay();
			mv.addObject("orderlist", orderlist);
			mv.setViewName("order/Refund");
			return mv;
		}
		//根据未退款查询订单
		@RequestMapping("/selectNoPay")
		public ModelAndView selectNoPay(){
			ModelAndView mv=new ModelAndView();
			List orderlist=osi.selectNoPay();
			mv.addObject("orderlist", orderlist);
			mv.setViewName("order/Refund");
			return mv;
		}
		
		//批量删除
		@RequestMapping("/deleteOrderByArray")
		public ModelAndView deleteOrderByArray(@RequestParam(value="array[]") int[] id){
			ModelAndView mv=new ModelAndView();
			int num=osi.deleteOrderByArray(id);
			/*System.out.println(id);*/
			List ooplist=osi.selectBadOrder();
			mv.addObject("orderlist", ooplist);
			mv.setViewName("order/Refund");
			return mv;
		}
}	
