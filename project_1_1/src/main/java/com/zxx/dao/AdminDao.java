package com.zxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxx.beans.Admin;
import com.zxx.beans.LoginRecord;

public interface AdminDao {
	//登录查询
	public Admin adminLogin(@Param("username")String username,@Param("password")String password);
	//查询管理员信息
	public Admin selectAdmininfo();
	//根据Id查询管理员
	public Admin selectAdminById(int id);
	//跟新密码
	public int updatePassword(String a_renewpassword, int id);
	//更新个人信息
	public int updateAdminInfo(Admin admin);
	//查询所有管理员信息
	public List<Admin> selectAllAdmin();
	//插入新管理员
	public int insertAdmin(Admin admin);
	//根据ID删除管理员
	public int deleteAdminById(String a_id);
	//根据条件查询
	public List<Admin> selectAdminByInfo(String a_username,String a_registerTime);
	//插入登录记录
	public void insertLoginRecord(LoginRecord lr);
	//查询所有登录记录
	public List<LoginRecord> selectAllLoginRecord();

}
