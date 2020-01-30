package com.belatrix.test.java.Logger;

import java.util.logging.Level;


import com.belatrix.test.java.Logger.Configuration.Configuration;
import com.belatrix.test.java.Logger.Constants.ConstantsLogger;
import com.belatrix.test.java.Logger.Exception.EsceptionMessage;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerConsole;


public class ConsoleLogger implements LoggerBelatrixI {
	
	private ManagerConsole managerConsole;
	
	private ConstantsLogger constant;

	public ConsoleLogger(Configuration belatrixConfiguration) {
		
		this.managerConsole = ManagerConsole.getInstace(belatrixConfiguration);
		logger.addHandler(this.managerConsole.getConsoleHandler());
	}
	
	public void addMessage(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		logger.log(Level.INFO, message);
	}

	public void addWarning(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		logger.log(Level.WARNING, message);
	}

	public void addError(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		logger.log(Level.SEVERE, message);
	}
	
	


}
