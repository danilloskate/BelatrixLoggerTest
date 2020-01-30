package com.belatrix.test.java.Logger.Manager;

import java.io.Serializable;
import java.util.logging.ConsoleHandler;

import com.belatrix.test.java.Logger.Configuration.Configuration;

public class ManagerConsole  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1937606611134381114L;
	
	private static ManagerConsole instance = null;	
	

	public  ManagerConsole (Configuration belatrixConfiguration) {		
		super();
	}
	
	public static synchronized ManagerConsole getInstace(Configuration configuration) {
		if(instance == null) {
			instance = new ManagerConsole(configuration);
		}
		return instance;
	}

	public ConsoleHandler getConsoleHandler() {
		return new ConsoleHandler();
	}

}
