package com.zxx.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Essay;
import com.zxx.service.EssayService;
@Controller
@RequestMapping("/essay")
public class EssayController {

	@Autowired
	private EssayService es;
	@RequestMapping("/selectAllEssay")
	public ModelAndView selectAllEssay() {
		ModelAndView mv = new ModelAndView();
		List<Essay> essayList = es.selectAllEssay();
		mv.addObject("essayList", essayList);
		mv.setViewName("article_view/article_list");
		return mv;
	}
	@RequestMapping("/deleteEssayById")
	public void deleteEssayById(int id) {
		es.deleteEssayById(id);
	}
	
}
