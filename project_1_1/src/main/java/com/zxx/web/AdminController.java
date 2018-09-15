package com.zxx.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zxx.beans.Admin;
import com.zxx.beans.LoginRecord;
import com.zxx.service.AdminService;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {
	private static final String a_id = null;
	@Autowired
	private AdminService adminService;

	/** 
     * 获取验证码 
     *  
     * @param response 
     * @param session 
     */  
    @RequestMapping("/getVerifyCode")  
    public void generate(HttpServletResponse response,HttpServletRequest request) {  
        ByteArrayOutputStream output = new ByteArrayOutputStream();  
        String verifyCodeValue = drawImg(output);  
        request.getSession().setAttribute("verifyCodeValue", verifyCodeValue);
        try {  
            ServletOutputStream out = response.getOutputStream();  
            output.writeTo(out);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    /** 
     * 绘画验证码 
     *  
     * @param output 
     * @return 
     */  
    private String drawImg(ByteArrayOutputStream output) {  
        String code = "";  
        // 随机产生4个字符  
        for (int i = 0; i < 4; i++) {  
            code += randomChar();  
        }  
        int width = 70;  
        int height = 25;  
        BufferedImage bi = new BufferedImage(width, height,  
                BufferedImage.TYPE_3BYTE_BGR);  
        Font font = new Font("Times New Roman", Font.PLAIN, 20);  
        // 调用Graphics2D绘画验证码  
        Graphics2D g = bi.createGraphics();  
        g.setFont(font);  
        Color color = new Color(66, 2, 82);  
        g.setColor(color);  
        g.setBackground(new Color(226, 226, 240));  
        g.clearRect(0, 0, width, height);  
        FontRenderContext context = g.getFontRenderContext();  
        Rectangle2D bounds = font.getStringBounds(code, context);  
        double x = (width - bounds.getWidth()) / 2;  
        double y = (height - bounds.getHeight()) / 2;  
        double ascent = bounds.getY();  
        double baseY = y - ascent;  
        g.drawString(code, (int) x, (int) baseY);  
        g.dispose();  
        try {  
            ImageIO.write(bi, "jpg", output);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return code;  
    }  
  
    /** 
     * 随机参数一个字符 
     *  
     * @return 
     */  
    private char randomChar() {  
        Random r = new Random();  
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";  
        return s.charAt(r.nextInt(s.length()));  
    }   
    /** 
     * 登录判断验证码逻辑 
     */  
    @RequestMapping("/login")  
    public void login(HttpServletRequest request, HttpServletResponse response) {  
        String verifyCodeValue = (String) request.getSession().getAttribute("verifyCodeValue");
		try {
			response.getWriter().print(verifyCodeValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }  

	/**
	 * 登录模块，登录成功后将用户信息放入到Session中--个人信息
	 * @param username
	 * @param password
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/adminLogin")
	public void adminLogin(@RequestParam(value="username",required=false) String username,
			@RequestParam(value="password",required=false) String password,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path=request.getContextPath();
		Admin admin1 = adminService.adminLogin(username, password);
		System.out.println(admin1);
		//存储登录记录
//		String ip = request.getRemoteAddr();
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	         ip = request.getHeader("Proxy-Client-IP");  
	     }  
	  
	     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	         ip = request.getHeader("WL-Proxy-Client-IP");  
	     }  
	  
	     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	         ip = request.getHeader("HTTP_CLIENT_IP");  
	     }  
	  
	     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	         ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
	     }  
	  
	     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	         ip = request.getRemoteAddr();  
	     }  
	  
	     if (ip != null && ip.indexOf(",") != -1) {  
	         String[] ipWithMultiProxy = ip.split(",");  
	  
	         for(int i = 0; i < ipWithMultiProxy.length; ++i) {  
	             String eachIpSegement = ipWithMultiProxy[i];  
	             if (!"unknown".equalsIgnoreCase(eachIpSegement)) {  
	                 ip = eachIpSegement;  
	                 break;  
	             }  
	         }  
	     }  
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		if(admin1!=null){
			LoginRecord lr=new LoginRecord( 1, "登陆成功", "江苏苏州（默认）",username,  ip, df.format(new Date()));
			adminService.insertLoginRecord(lr);
			request.getSession().setAttribute("admin", admin1);
			response.sendRedirect(path+"/view/index.jsp");
			
		}else{
			LoginRecord lr=new LoginRecord( 2, "登陆失败", "江苏苏州（默认）", username, ip, df.format(new Date()));
			adminService.insertLoginRecord(lr);
			request.getSession().setAttribute("loginError", "您还没有登录，请登录...");
			response.sendRedirect(path+"/view/login.jsp");
		}

	}
	
	/**
	 * 注销模块
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/logout")
	public String Logout(HttpServletRequest request,HttpServletResponse response){
		String ip=request.getRemoteAddr();
		System.out.println(ip);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        Admin admin=(Admin) request.getSession().getAttribute("admin");
        LoginRecord lr=new LoginRecord( 3, "注销登录", "江苏苏州（默认）",admin.getA_username(),  ip, df.format(new Date()));
		adminService.insertLoginRecord(lr);
		request.getSession().removeAttribute("admin");
		return "login";
		
	}
	
	/**
	 * 个人列表——根据Id查询管理员个人信息+查询登录记录
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/selectAdminInfo")
	public ModelAndView selectAdminInfo(HttpServletRequest request){
		//查询登录记录
		List<LoginRecord> loginRecordList=adminService.selectAllLoginRecord();
		request.getSession().setAttribute("loginRecordList", loginRecordList);
		
		//根据Id查询管理员个人信息
		Admin admin=(Admin) request.getSession().getAttribute("admin");
		int id=admin.getA_id();
		Admin admin1=adminService.selectAdminById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("admininfo", admin1);
		mv.setViewName("admin_view/admin_info");
		return mv;	
	}
	
	/**
	 * 更新密码--个人信息
	 * @param a_renewpassword
	 * @param request
	 * @param response
	 * @throws IOException
	 */

	@RequestMapping(value="/updatePassword")
	public void updatePassword(@RequestParam(value="a_renewpassword",required=false)String a_renewpassword,
			HttpServletRequest request,HttpServletResponse response) throws IOException{
		String path=request.getContextPath();
		Admin admin=(Admin) request.getSession().getAttribute("admin");
		boolean flag=adminService.updatePassword(a_renewpassword,admin.getA_id());
		
		if(flag){
			request.getSession().removeAttribute("admin");
			response.sendRedirect(path+"/view/login.jsp");
		}
	}
	

	/**
	 * 更新个人信息--个人信息
	 * @param a_username
	 * @param a_sex
	 * @param a_age
	 * @param a_mobilePhone
	 * @param a_email
	 * @param a_qq
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateAdminInfo")
	public void updateAdminInfo(String a_username,String a_sex,String a_age,String a_mobilePhone,
			String a_email,String a_qq,HttpServletRequest request,HttpServletResponse response) throws IOException{
		String path=request.getContextPath();
		Admin admin=(Admin) request.getSession().getAttribute("admin");
		Admin admin1=new Admin(admin.getA_id(), a_username, "", a_sex, Integer.parseInt(a_age), a_mobilePhone, a_email, a_qq, "", "");
		System.out.println(admin1);
		boolean flag=adminService.updateAdminInfo(admin1);
		String str="";
		if(flag){
			response.sendRedirect(path+"/admin/selectAdminInfo");
		}
		
	}
	
	/**
	 * 查看管理员列表信息——管理员列表
	 * @return
	 */
	@RequestMapping("/selectAllAdmin")
	public ModelAndView selectAllAdmin(){
		ModelAndView mv=new ModelAndView();
		List<Admin> adminList=new ArrayList<Admin>();
		adminList=adminService.selectAllAdmin();
		System.out.println(adminList);
		mv.addObject("adminList", adminList);
		mv.setViewName("admin_view/administrator");
		return mv;
		
	}
	/**
	 * 插入新管理员
	 * @param a_username
	 * @param a_password
	 * @param a_sex
	 * @param a_mobilePhone
	 * @param a_email
	 * @param a_grade
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/insertAdmin")
	public void insertAdmin(String a_username,String a_password,String a_sex,String a_mobilePhone,
			String a_email,String a_grade,HttpServletRequest request,HttpServletResponse response ) throws IOException{
		String path=request.getContextPath();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println(a_username+":"+a_sex);
		Admin admin =new Admin( a_username, a_password, a_sex, 20, a_mobilePhone, a_email, "暂无", a_grade, df.format(new Date()));
		System.out.println(admin);
		boolean flag=adminService.insertAdmin(admin);
		String str="";
		if(flag){
			response.sendRedirect(path+"/admin/selectAllAdmin");
		}
	}
	/**
	 * 管理员列表模块编辑功能
	 * @param a_id
	 * @return
	 */
	//第一步，进入编辑页面，根据id显示修改前的信息
	@RequestMapping("/modifyAdminInfo")
	public ModelAndView modifyAdminInfo(String  a_id){
		ModelAndView mv=new ModelAndView();
		
		Admin admin=adminService.selectAdminById(Integer.parseInt(a_id));
		mv.addObject("admin_modify",admin);
		mv.setViewName("admin_view/member-add");
		return mv;
	}
	//第二步，使用自动装箱获得参数进行修改操作
	@RequestMapping("/updateAdminInfo2")
	public void updateAdminInfo2(Admin admin,HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		String path=request.getContextPath();
		System.out.println(admin);
		boolean flag=adminService.updateAdminInfo(admin);
		if(flag){
			response.sendRedirect(path+"/view/admin_view/modifysuccess.jsp");
		}
	}
	
	/**
	 * 根据id删除管理员
	 * @param a_id
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/deleteAdminById")
	public void deleteAdminById(String a_id,
			HttpServletRequest request,HttpServletResponse response) throws IOException{
		String path=request.getContextPath();
	
		boolean flag=adminService.deleteAdminById(a_id);
		if(flag){
			response.sendRedirect(path+"/admin/selectAllAdmin");
		
	}
	}
	

	/**
	 * 根据条件查询管理员名称和时间
	 * 获取参数然后返回查询结果
	 * @param a_username
	 * @param a_registerTime
	 * @return
	 */
	@RequestMapping("/selectAdminByInfo")
	public ModelAndView selectAdminByInfo(String a_username,String a_registerTime){
		System.out.println(a_username+":"+a_registerTime);
		ModelAndView mv=new ModelAndView();
		List<Admin> adminList=adminService.selectAdminByInfo(a_username,a_registerTime);
		mv.addObject("adminList", adminList);
		mv.setViewName("admin_view/administrator");
		return mv;
		
	}
}
