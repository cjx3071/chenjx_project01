package com.zxx.service;

import java.util.List;

import com.zxx.beans.Feedback;


public interface FeedbackService {
	//查询所有意见反馈
	public List<Feedback> selectAllFeedback();
	//根据id删除意见反馈
	public boolean deleteFeedbackById(int id);
}
