package com.zxx.service;

import java.util.List;

import com.zxx.beans.User;

public interface UserService {
	public List<User> selectAllUser();
	
	public User selectUserById(int uid);
	
	public int insertUser(User user);

	public int updateUserById(User User);

	public int deleteUserById(int uid);
}
