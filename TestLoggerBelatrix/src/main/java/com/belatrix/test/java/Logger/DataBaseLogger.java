package com.belatrix.test.java.Logger;

import com.belatrix.test.java.Logger.Configuration.Configuration;
import com.belatrix.test.java.Logger.Constants.ConstantsLogger;
import com.belatrix.test.java.Logger.Enum.LoggerMessageTypes;
import com.belatrix.test.java.Logger.Exception.EsceptionMessage;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerDataBase;


public class DataBaseLogger implements LoggerBelatrixI{
	
	
	private ManagerDataBase managerDataBase;
	
	private ConstantsLogger constant;
	
	
	public DataBaseLogger(Configuration belatrixConfiguration) {
		this.managerDataBase = ManagerDataBase.getInstance(belatrixConfiguration);
	}

	@Override
	public void addWarning(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		String messageError = constant.warning  + message;
		this.managerDataBase.insertMessageBD(messageError, LoggerMessageTypes.WARNING.getId());
	}

	@Override
	public void addError(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		String messageError = constant.empity + constant.error  + message;
		this.managerDataBase.insertMessageBD(messageError, LoggerMessageTypes.ERROR.getId());
		
	}

	@Override
	public void addMessage(String message) {
		if (message.isEmpty() && message.equalsIgnoreCase(constant.empity)) {
			throw new EsceptionMessage(constant.messageEmpity);
		}
		String messageError = constant.message  + message;
		this.managerDataBase.insertMessageBD(messageError, LoggerMessageTypes.MESSAGE.getId());
		
	}

}
