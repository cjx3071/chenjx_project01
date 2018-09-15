package com.zxx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Admin;
import com.zxx.beans.LoginRecord;
import com.zxx.dao.AdminDao;
import com.zxx.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;

	@Override
	public Admin adminLogin(String username,String password) {
		Admin admin = adminDao.adminLogin(username, password);
		return admin;
	}

	@Override
	public Admin selectAdminById(int id) {
		Admin admin=adminDao.selectAdminById(id);
		return admin;
	}

	@Override
	public boolean updatePassword(String a_renewpassword,int id) {
		boolean flag=false;
		int i =adminDao.updatePassword(a_renewpassword, id);
		if(i>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean updateAdminInfo(Admin admin) {
		boolean flag=false;
		int i =adminDao.updateAdminInfo(admin);
		if(i>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Admin> selectAllAdmin() {
		List<Admin> adminList=new ArrayList<Admin>();
		adminList=adminDao.selectAllAdmin();
		return adminList;
	}


	@Override
	public boolean insertAdmin(Admin admin) {
		
		boolean flag=false;
		int i =adminDao.insertAdmin(admin);
		if(i>0){
			flag=true;
		}
		return flag;	
		}

	@Override
	public boolean deleteAdminById(String a_id) {
		boolean flag=false;
		int i =adminDao.deleteAdminById(a_id);
		if(i>0){
			flag=true;
		}
		return flag;	
	}

	@Override
	public List<Admin> selectAdminByInfo(String a_username,
			String a_registerTime) {
		
		List<Admin> adminList=adminDao.selectAdminByInfo(a_username, a_registerTime);
		return adminList;
	}

	@Override
	public void insertLoginRecord(LoginRecord lr) {
		adminDao.insertLoginRecord(lr);
	}

	@Override
	public List<LoginRecord> selectAllLoginRecord() {
		List<LoginRecord> loginRecordList=adminDao.selectAllLoginRecord();
		return loginRecordList;
	}
	

}
