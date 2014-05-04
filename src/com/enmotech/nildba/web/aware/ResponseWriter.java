package com.enmotech.nildba.web.aware;


import javax.servlet.http.HttpServletResponse;

/**
 * Base Response Writer class
 * @author Rio919
 *
 */
public class ResponseWriter {

	private static final String RESPONSE_HEADER_CACHE_CONTROL ="Cache-Control";
	private static final String RESPONSE_HEADER_NO_CACHE ="no-cache";
	
	protected void setResponseHeader(HttpServletResponse response) {
		response.setHeader(RESPONSE_HEADER_CACHE_CONTROL, RESPONSE_HEADER_NO_CACHE);
	}
	
}
