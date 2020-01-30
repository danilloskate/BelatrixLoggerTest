package com.belatrix.test.java.Logger.Factory;

import com.belatrix.test.java.Logger.ConsoleLogger;
import com.belatrix.test.java.Logger.DataBaseLogger;
import com.belatrix.test.java.Logger.FileLogger;
import com.belatrix.test.java.Logger.Configuration.Configuration;
import com.belatrix.test.java.Logger.Configuration.ConfigurationDefault;
import com.belatrix.test.java.Logger.Enum.LoggerTypes;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;

public class FactoryLogger {
	
	private FactoryLogger() {
		super();
	}
	
	public static LoggerBelatrixI getLogger(String type) throws Exception {
		if (LoggerTypes.FILE.getType().equals(type)) {
			return new FileLogger(new ConfigurationDefault());
		} else if (LoggerTypes.CONSOLE.getType().equals(type)) {
			return new ConsoleLogger(new ConfigurationDefault());
		} else if (LoggerTypes.DATABASE.getType().equals(type)) {
			return new DataBaseLogger(new ConfigurationDefault());
		} else {
			throw new Exception("Invalid configuration | Logger type not valid!");
		}
	}
	
	public static LoggerBelatrixI getLogger(String type, Configuration configuration) throws Exception {
		if (LoggerTypes.FILE.getType().equals(type)) {
			return new FileLogger(configuration);
		} else if (LoggerTypes.CONSOLE.getType().equals(type)) {
			return new ConsoleLogger(configuration);
		} else if (LoggerTypes.DATABASE.getType().equals(type)) {
			return new DataBaseLogger(configuration);
		} else {
			throw new Exception("Logger type not valid!");
		}
	}

}
