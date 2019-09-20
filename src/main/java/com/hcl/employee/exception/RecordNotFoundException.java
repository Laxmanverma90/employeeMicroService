package com.hcl.employee.exception;

/**
 * @author Laxman
 * @date 19 SEPT 2019
 */
public class RecordNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public RecordNotFoundException(String message) {
		super(message);
	}
}
