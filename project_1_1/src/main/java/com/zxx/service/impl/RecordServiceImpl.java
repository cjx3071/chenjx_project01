package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxx.beans.Record;
import com.zxx.dao.RecordDao;
import com.zxx.service.RecordService;



@Service("recordService")
public class RecordServiceImpl implements RecordService{
	
	/**
	 * 使用依赖注入将容器中的dao层接口的对象赋值给成员变量
	 */
	@Autowired
	private RecordDao recordDao;

	@Override
	public List<Record> selectAllRecord() {
		// TODO Auto-generated method stub
		return recordDao.selectAllRecord();
	}

	@Override
	public Record selectUserById(int id) {
		// TODO Auto-generated method stub
		return recordDao.selectRecordById(id);
	}

	@Override
	public int insertRecord(Record user) {
		// TODO Auto-generated method stub
		return recordDao.insertRecord(user);
	}

	@Override
	public int updateRecordById(Record record) {
		// TODO Auto-generated method stub
		return recordDao.updateRecordById(record);
	}

	@Override
	public int deleteRecordById(int id) {
		// TODO Auto-generated method stub
		return recordDao.deleteRecordById(id);
	}
	
	
	
	
}
