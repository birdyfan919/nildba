package com.enmotech.nildba.web.base;


import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Base controller of NILDBA.
 * Supply method to access HttpServletRequest, HttpServletResponse, 
 * ServletContext and wrapped sessionMap
 * 
 * @author Rio919
 */
public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, ServletContextAware, SessionAware{
	
	private static final long serialVersionUID = -9018504851091232736L;
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map<String, Object> sessionMap;
	protected ServletContext context;
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}
	
}
