package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.OOP;
import com.zxx.beans.Order;
import com.zxx.dao.OrderDao;
import com.zxx.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;
	@Override
	public List<Order> selectAllOrder() {
		return orderDao.selectAllOrder();
	}
	@Override
	public int deleteOrderByid(int id) {
		return orderDao.delectOrderByid(id);
	}
	@Override
	public List selectOrderById(int id) {
		return orderDao.selectOrderById(id);
	}
	@Override
	public List selectDail(int id) {
		return orderDao.selectDail(id);
	}
	@Override
	public List selectOrderByOtime(String otime) {
		return orderDao.selectOrderByOtime(otime);
	}
	@Override
	public int updateOrder(int id) {
		return orderDao.updateOrder(id);
	}
	@Override
	public List selectAllOOP() {
		return orderDao.selectAllOOP();
	}
	@Override
	public int selectAccount() {
		return orderDao.selectAccount();
	}
	@Override
	public int selectTodayMoney(String otime) {
		return orderDao.selectTodayMoney(otime);
	}
	@Override
	public int selectSuccessOrder() {
		return orderDao.selectSuccessOrder();
	}
	@Override
	public List selectTodayOrder(String otime) {
		return orderDao.selectTodayOrder(otime);
	}
	@Override
	public int selectTodayAccount(String otime) {
		return orderDao.selectTodayAccount(otime);
	}
	@Override
	public List selectMonthOrder(String otime) {
		return orderDao.selectMonthOrder(otime);
	}
	@Override
	public int selectMonthAccount(String otime) {
		return orderDao.selectMonthAccount(otime);
	}
	@Override
	public List selectBadOrder() {
		return orderDao.selectBadOrder();
	}
	@Override
	public int updateBadOrder(int id) {
		return orderDao.updateBadOrder(id);
	}
	@Override
	public List selectBadOrderByid(int id) {
		return orderDao.selectBadOrderByid(id);
	}
	@Override
	public List selectBadOrderByOtime(String otime) {
		return orderDao.selectBadOrderByOtime(otime);
	}
	@Override
	public List selectBadOrderBypay() {
		return orderDao.selectBadOrderBypay();
	}
	@Override
	public List selectNoPay() {
		return orderDao.selectNoPay();
	}
	@Override
	public int deleteOrderByArray(int[] id) {
		return orderDao.deleteOrderByArray(id);
	}

}
