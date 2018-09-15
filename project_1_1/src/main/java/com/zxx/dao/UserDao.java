package com.zxx.dao;

import java.util.List;
import com.zxx.beans.User;

public interface UserDao {
	public List<User> selectAllUser();

	public User selectUserById(int uid);

	public int insertUser(User user);

	public int updateUserById(User User);

	public int deleteUserById(int uid);
}