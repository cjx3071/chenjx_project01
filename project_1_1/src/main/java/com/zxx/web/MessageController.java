package com.zxx.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Message;
import com.zxx.service.MessageService;
@Controller
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService ms;
	@RequestMapping("/selectAllMessage")
	public ModelAndView selectAllMessage() {
		ModelAndView mv = new ModelAndView();
		List<Message> messageList = ms.selectAllMessage();
		mv.addObject("messageList", messageList);
		mv.setViewName("article_view/Guestbook");
		return mv;
	}
	@RequestMapping("/updateMstate")
	public void updateMstate(int id) {
		ms.updateMstate(id);
	}
	
	@RequestMapping("/deleteMessageById")
	public void deleteMessageById(int id) {
		ms.deleteMessageById(id);
	}
	/**
	 * 批量删除产品
	 */
	@ResponseBody
	@RequestMapping("/removesAllMessage")
	public void removesAllMessage(int[]  message) {
		for (int id : message) {
			ms.deleteMessageById(id);
		}
	}
	@ResponseBody
	@RequestMapping("/selectMessageById")
	public Message selectMessageById(int id) {
		Message message=ms.selectMessageById(id);
		return message;
	}
}
