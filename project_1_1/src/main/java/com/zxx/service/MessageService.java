package com.zxx.service;

import java.util.List;

import com.zxx.beans.Message;

public interface MessageService {
	//查询所有留言
	public List<Message> selectAllMessage();
	//更新留言状态
	public boolean updateMstate(int id);
	//根据id删除留言
	public boolean deleteMessageById(int id);
	//删除所有留言
	public boolean deleteAllMessage(Message message);
	//根据id查询留言
	public Message selectMessageById(int id);
}
