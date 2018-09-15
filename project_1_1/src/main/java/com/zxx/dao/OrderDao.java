package com.zxx.dao;

import java.util.List;

import com.zxx.beans.OOP;
import com.zxx.beans.Order;
import com.zxx.beans.Orderdail;

public interface OrderDao {
	//查询所有订单
	public List<Order> selectAllOrder() ;
	
	//根据id查询订单
	public List selectOrderById(int id);
	
	//根据时间模糊查询订单
	public List selectOrderByOtime(String otime);
	
	//删除订单
	public int delectOrderByid(int id);
	
	//查询订单详情
	public List selectDail(int id);
	
	//更改订单，未发货改为发货
	public int updateOrder(int id);
	
	//查询交易订单，包含序号
	public List selectAllOOP();
	
	//查询交易总金额
	public int selectAccount();
	
	//查询当天订单金额
	public int selectTodayMoney(String otime);
	
	//查询交易成功的订单
	public int selectSuccessOrder();
	
	//查询当天订单
	public List selectTodayOrder(String otime);
	
	//查询当天订单数量
	public int selectTodayAccount(String otime);
	
	//查询当月订单
	public List selectMonthOrder(String otime);
	
	//查询当月订单数量
	public int selectMonthAccount(String otime);
	
	//查询交易失败的订单
	public List selectBadOrder();
	
	//更改订单，把未退款的退款
	public int updateBadOrder(int id);
	
	//根据id查询交易失败订单
	public List selectBadOrderByid(int id);
	
	//根据时间模糊查询交易失败的订单
	public List selectBadOrderByOtime(String otime);
	
	//根据已退款查询订单
	public List selectBadOrderBypay();
	
	//根据未付款查询订单
	public List selectNoPay();
	
	//批量删除订单
	public int deleteOrderByArray(int[] id);
}
