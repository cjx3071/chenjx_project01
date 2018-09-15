package com.zxx.dao;


import java.util.List;

import com.zxx.beans.Record;

public interface RecordDao {
	public List<Record> selectAllRecord();

	public Record selectRecordById(int id);

	public int insertRecord(Record user);

	public int updateRecordById(Record record);

	public int deleteRecordById(int id);
}