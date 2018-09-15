package com.zxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.User;
import com.zxx.dao.UserDao;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	/**
	 * 使用依赖注入将容器中的dao层接口的对象赋值给成员变量
	 */
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}

	@Override
	public User selectUserById(int uid) {
		return userDao.selectUserById(uid);
	}

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int updateUserById(User User) {
		return userDao.updateUserById(User);
	}

	@Override
	public int deleteUserById(int uid) {
		return userDao.deleteUserById(uid);
	}
	
	
	
}
