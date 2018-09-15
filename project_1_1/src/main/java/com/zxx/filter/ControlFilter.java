package com.zxx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.zxx.beans.Admin;

public class ControlFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("ControlFilter开始了");
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		Admin admin=(Admin) httpRequest.getSession().getAttribute("admin");
		if(admin==null){
			
			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		}else{
			chain.doFilter(request, response);
		}

		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
