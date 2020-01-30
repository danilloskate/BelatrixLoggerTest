package com.belatrix.test.java.Logger.Interfaces;

import java.util.logging.Logger;

public interface LoggerBelatrixI {

	public static final Logger logger = Logger.getLogger("LoggerBelatrix");

	public void addWarning(String message);

	public void addError(String message);

	public void addMessage(String message);

}
