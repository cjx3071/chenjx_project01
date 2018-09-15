package com.zxx.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Record;
import com.zxx.service.RecordService;


@Controller
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	private RecordService recordService;

	@RequestMapping("/selectAllRecord")
	public ModelAndView selectAllRecord(){
		ModelAndView mv=new ModelAndView();
		List<Record> RecordList=recordService.selectAllRecord();
		System.out.println(RecordList);
		mv.addObject("RecordList",RecordList);
		mv.setViewName("Userview/integration");
		return mv;
	}
	

}
