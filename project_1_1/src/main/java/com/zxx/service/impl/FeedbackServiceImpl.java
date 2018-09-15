package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zxx.beans.Feedback;
import com.zxx.dao.FeedbackDao;
import com.zxx.service.FeedbackService;
@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	@Qualifier("feedbackDao")
	private FeedbackDao fd;
	@Override
	public List<Feedback> selectAllFeedback() {
		return fd.selectAllFeedback();
	}
	@Override
	public boolean deleteFeedbackById(int id) {
		if (fd.deleteFeedbackById(id)>0) {
			return true;
		}
		return false;
	}

}
