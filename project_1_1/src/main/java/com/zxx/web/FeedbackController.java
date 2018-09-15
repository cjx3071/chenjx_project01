package com.zxx.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Feedback;
import com.zxx.service.FeedbackService;
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService fs;
	@RequestMapping("/selectAllFeedback")
	public ModelAndView selectAllFeedback() {
		ModelAndView mv = new ModelAndView();
		List<Feedback> feedbackList = fs.selectAllFeedback();
		mv.addObject("feedbackList", feedbackList);
		mv.setViewName("article_view/Feedback");
		return mv;
	}
	
	@RequestMapping("/deleteFeedbackById")
	public void deleteFeedbackById(int id) {
		fs.deleteFeedbackById(id);
	}
}
