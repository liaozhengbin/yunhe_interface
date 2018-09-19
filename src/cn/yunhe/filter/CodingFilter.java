package cn.yunhe.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CodingFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest=(HttpServletRequest)request;
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		
		httpRequest.setCharacterEncoding("UTF-8");
		httpResponse.setCharacterEncoding("UTF-8");
		httpResponse.setContentType("text/html; charset=utf-8");
		
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");//允许跨域访问的域，可以是通配符”*”；
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET");
		httpResponse.setHeader("Access-Control-Max-Age", "1800");
		httpResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
		
		chain.doFilter(httpRequest, httpResponse);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
