package com.belatrix.test.java.Logger;

import java.util.logging.Level;

import com.belatrix.test.java.Logger.Configuration.Configuration;
import com.belatrix.test.java.Logger.Constants.ConstantsLogger;
import com.belatrix.test.java.Logger.Exception.EsceptionMessage;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerFile;

public class FileLogger implements LoggerBelatrixI {

	private ManagerFile managerFile;

	private ConstantsLogger constant;

	public FileLogger(Configuration belatrixConfiguration) {
		this.managerFile = new ManagerFile(belatrixConfiguration);
		logger.addHandler(this.managerFile.getFileHandler());
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

	public void addMessage(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		logger.log(Level.WARNING, message);

	}

}
