package com.belatrix.test.java.Logger.Enum;

public enum LoggerTypes {
	
	CONSOLE ("console"), 
	DATABASE ("database"), 
	FILE ("file");
	
	private String type;
	
	private LoggerTypes(final String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	

}
