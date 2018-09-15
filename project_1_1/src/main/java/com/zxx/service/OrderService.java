package com.zxx.service;

import java.util.List;

import com.zxx.beans.Order;

public interface OrderService {
	
	public List<Order> selectAllOrder();
	
	public int deleteOrderByid(int id);
	
	public List selectOrderById(int id);
	
	public List selectOrderByOtime(String otime);
	
	//查询订单详情
	public List selectDail(int id);
	
	//更改订单，未发货改为发货
	public int updateOrder(int id);
	
	//查询交易订单
	public List selectAllOOP();
	
	public int selectAccount();
	
	public int selectTodayMoney(String otime);
	
	public int selectSuccessOrder();
	
	public List selectTodayOrder(String otime);
	
	public int selectTodayAccount(String otime);
	
	//查询当月订单
	public List selectMonthOrder(String otime);
	
	//查询当月订单数量
	public int selectMonthAccount(String otime);
	
	//查询交易失败的订单
	public List selectBadOrder();
	
	//更改订单，退款
	public int updateBadOrder(int id);
	
	//根据id查询交易失败的订单
	public List selectBadOrderByid(int id);
	
	//根据时间模糊查询交易失败的订单
	public List selectBadOrderByOtime(String otime);
	
	//跟据已退款查询订单
	public List selectBadOrderBypay();
	
	public List selectNoPay();
	
	//批量删除
	public int deleteOrderByArray(int[] id);
}
