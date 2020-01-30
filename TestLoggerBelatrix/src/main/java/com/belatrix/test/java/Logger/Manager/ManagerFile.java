package com.belatrix.test.java.Logger.Manager;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.FileHandler;

import com.belatrix.test.java.Logger.Configuration.Configuration;
import com.belatrix.test.java.Logger.Exception.LogExceptionFile;

import com.belatrix.test.java.Logger.Exception.HandlerException;

public class ManagerFile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7702010492650479623L;

	private Configuration configuration;

	public ManagerFile(Configuration belatrixConfiguration) {
		super();
		this.configuration = belatrixConfiguration;
	}

	public File getFileLog() {
		File logFile = new File(this.configuration.getProperty("logger.FilePath"));
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (Exception e) {
				throw new LogExceptionFile("Error creating a new file ", e);
			}
		}
		return logFile;

	}

	public FileHandler getFileHandler() {
		try {
			getFileLog();
			return new FileHandler(this.configuration.getProperty("logger.FilePath"));
		} catch (SecurityException | IOException e) {
			throw new HandlerException("Error get file handler.", e);
		}
	}

}
