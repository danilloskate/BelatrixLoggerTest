package com.belatrix.test.java.Logger.Exception;

public class LogExceptionFile extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 430629570577913769L;

	public LogExceptionFile(String message) {
		super(message);
	}

	public LogExceptionFile(String message, Throwable cause) {
		super(message, cause);
	}

}
