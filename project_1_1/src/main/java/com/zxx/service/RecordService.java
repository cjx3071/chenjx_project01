package com.zxx.service;

import java.util.List;

import com.zxx.beans.Record;
import com.zxx.beans.User;

public interface RecordService {
	public List<Record> selectAllRecord();

	public Record selectUserById(int id);

	public int insertRecord(Record user);

	public int updateRecordById(Record record);

	public int deleteRecordById(int id);
}
