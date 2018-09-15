package com.zxx.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.User;
import com.zxx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/selectAllUser")
	public ModelAndView selectAllUser(){
		ModelAndView mv=new ModelAndView();
		List<User> userList=userService.selectAllUser();
		System.out.println(userList);
		mv.addObject("userList",userList);
		mv.setViewName("Userview/user_list");
		return mv;
	}
	
	@RequestMapping("/selectAllGrade")
	public ModelAndView selectAllGrade(){
		ModelAndView mv=new ModelAndView();
		List<User> userList=userService.selectAllUser();
		System.out.println(userList);
		mv.addObject("userList",userList);
		mv.setViewName("Userview/member-Grading");
		return mv;
	}
	
	
	@RequestMapping("/insertUser")
	public ModelAndView insertUser(User user){
		ModelAndView mv=new ModelAndView();
		System.out.println(user);
		user.setUgrade("普通会员");
		user.setUintegral(0);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		user.setUtime(df.format(new Date()));
		int num=userService.insertUser(user);
		System.out.println(num);
		String msg="添加成功";
		if(num==0){
			msg="添加失败";
		}
		mv.addObject("msg",msg);
		List<User> userList=userService.selectAllUser();
		System.out.println(userList);
		mv.addObject("userList",userList);
		mv.setViewName("Userview/user_list");
		return mv;
	}
	
	@RequestMapping("/deleteUserById")
	public ModelAndView deleteUserById(int uid){
		ModelAndView mv=new ModelAndView();
		int num=userService.deleteUserById(uid);
		System.out.println(num);
		String msg="删除成功";
		if(num==0){
			msg="删除失败";
		}
		mv.addObject("msg",msg);
		List<User> userList=userService.selectAllUser();
		System.out.println(userList);
		mv.addObject("userList",userList);
		mv.setViewName("Userview/user_list");
		return mv;
	}
	
	
	@RequestMapping("/selectUserById")
	public ModelAndView selectUserById(int uid){
		ModelAndView mv=new ModelAndView();
		User user=userService.selectUserById(uid);
		System.out.println(user);
		mv.addObject("user",user);
		mv.setViewName("Userview/member-show");
		return mv;
	}
	
	@RequestMapping("/updateUserById")
	public ModelAndView updateUserById(User user){
		ModelAndView mv=new ModelAndView();
		int num=userService.updateUserById(user);
		System.out.println(num);
		String msg="更新成功";
		if(num==0){
			msg="更新失败";
		}
		List<User> userList=userService.selectAllUser();
		System.out.println(userList);
		mv.addObject("userList",userList);
		mv.setViewName("Userview/user_list");
		return mv;
	}
}
