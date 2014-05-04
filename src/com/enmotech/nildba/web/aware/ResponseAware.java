package com.enmotech.nildba.web.aware;

import java.io.IOException;

/**
 * MIME Type Mappings. Below shows the usually used MIME type, 
 * 
 * text/html: html source code;
 * text/plain: pure plain text;
 * application/json: json data format;
 * application/xml: xml data format;
 * application/javascript: javascript source code;
 * 
 * @author Rio919
 */
public interface ResponseAware {

	public void setContentType();
	
	public void write(Object object) throws IOException;
	
}
