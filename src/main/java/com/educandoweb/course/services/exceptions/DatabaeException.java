package com.educandoweb.course.services.exceptions;

import org.hibernate.dialect.Database;

public class DatabaeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaeException(String msg){
		super(msg);
		
	}

}
