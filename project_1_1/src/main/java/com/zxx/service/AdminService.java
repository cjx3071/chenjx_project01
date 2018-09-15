package com.zxx.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Admin;
import com.zxx.beans.LoginRecord;

public interface AdminService {
	//功能：实现登录
	public Admin adminLogin(String username,String password);
	//功能：查询个人信息
	public Admin selectAdminById(int id);
	//功能：更新密码
	public boolean updatePassword(String a_renewpassword,int id);
	//功能：更新个人信息
	public boolean updateAdminInfo(Admin admin);
	//功能：查看管理员列表
	public List<Admin> selectAllAdmin();
	//功能：添加新管理员
	public boolean insertAdmin(Admin admin);
	//功能：删除管理员
	public boolean deleteAdminById(String a_id);
	//根据信息查询管理员
	public List<Admin> selectAdminByInfo(String a_username,String a_registerTime);
	//插入登录信息
	public void insertLoginRecord(LoginRecord lr);
	//查询登录记录
	public List<LoginRecord> selectAllLoginRecord();


}
