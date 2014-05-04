package com.enmotech.nildba.web.aware;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

/**
 * JSON stream writer
 * 
 * @author Rio919
 */
public class ResponseJSONWriter extends ResponseWriter implements ResponseAware{
	
	private static final String RESPONSE_CONTENT_TYPE = "application/json; charset=utf-8";
	
	private HttpServletResponse response;
	
	private ResponseJSONWriter(){}
	
	public ResponseJSONWriter(HttpServletResponse response){
		this.response = response;
	}
	
		
	public void setContentType() {
		this.response.setContentType(RESPONSE_CONTENT_TYPE);
	}

	public void write(Object object) throws IOException {
		this.setResponseHeader(this.response);
		this.setContentType();
		getPrintWriter().write(JSON.toJSONString(object, true));
	}
	
	private PrintWriter getPrintWriter() throws IOException{
		return this.response.getWriter();
	} 
	
}
