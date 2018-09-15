package com.zxx.dao;

import java.util.List;

import com.zxx.beans.Feedback;

public interface FeedbackDao {
	//查询所有意见反馈
	public List<Feedback> selectAllFeedback();
	//根据id删除意见反馈
	public int deleteFeedbackById(int id);
}
