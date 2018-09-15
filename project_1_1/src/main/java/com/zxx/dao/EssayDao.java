package com.zxx.dao;

import java.util.List;

import com.zxx.beans.Essay;

public interface EssayDao {
	//查询所有文章
	public List<Essay> selectAllEssay();
	//根据id删除文章
	public int deleteEssayById(int id);
}
