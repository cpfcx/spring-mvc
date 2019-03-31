package com.baiwang.exception;

public class StudentException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;
	
    public StudentException(String message) {
    	
    	this.message = message;
    }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
