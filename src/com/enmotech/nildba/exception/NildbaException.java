package com.enmotech.nildba.exception;

/**
 * Nildba Exception Definition.
 * Extended from RuntimeException, when NildbaBusinessException 
 * occured,  transaction rollback automatically by Spring
 * @author Rio919
 *
 */
public class NildbaException extends RuntimeException {
	
	private static final long serialVersionUID = 7185600975272352671L;

	public NildbaException(){
		super();
	}
	
	public NildbaException(String msg){
		super(msg);
	}
	
	public NildbaException(String msg, Throwable cause){
		super(msg, cause);
	}
	
	public NildbaException(Throwable cause){
		super(cause);
	}
}
