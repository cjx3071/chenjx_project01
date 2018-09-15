package com.zxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zxx.beans.Essay;
import com.zxx.dao.EssayDao;
import com.zxx.service.EssayService;
@Service
public class EssayServiceImpl implements EssayService {

	@Autowired
	@Qualifier("essayDao")
	private EssayDao ed;
	@Override
	public List<Essay> selectAllEssay() {
		return ed.selectAllEssay();
	}
	@Override
	public boolean deleteEssayById(int id) {
		if (ed.deleteEssayById(id)>0) {
			return true;
		}
		return false;
	}

}
