package com.zxx.service;

import java.util.List;

import com.zxx.beans.Essay;


public interface EssayService {
	//查询所有文章
	public List<Essay> selectAllEssay();
	//根据id删除文章
	public boolean deleteEssayById(int id);
}
