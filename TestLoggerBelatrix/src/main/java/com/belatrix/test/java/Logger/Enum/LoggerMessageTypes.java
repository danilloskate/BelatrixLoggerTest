package com.belatrix.test.java.Logger.Enum;

public enum LoggerMessageTypes {

	MESSAGE(1, "message"), ERROR(2, "error"), WARNING(3, "warning");

	private int id;
	private String name;

	private LoggerMessageTypes(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
