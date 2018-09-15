package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zxx.beans.Message;
import com.zxx.dao.MessageDao;
import com.zxx.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	@Qualifier("messageDao")
	private MessageDao md;
	@Override
	public List<Message> selectAllMessage() {
		return md.selectAllMessage();
	}
	@Override
	public boolean updateMstate(int id) {
		if (md.updateMstate(id)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteMessageById(int id) {
		if (md.deleteMessageById(id)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteAllMessage(Message message) {
		if (md.deleteAllMessage(message)>0) {
			return true;
		}
		return false;
	}
	@Override
	public Message selectMessageById(int id) {
		return md.selectMessageById(id);
	}
}
