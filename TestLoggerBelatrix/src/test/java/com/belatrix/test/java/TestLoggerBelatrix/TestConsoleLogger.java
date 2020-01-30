package com.belatrix.test.java.TestLoggerBelatrix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.belatrix.test.java.Logger.ConsoleLogger;
import com.belatrix.test.java.Logger.Configuration.ConfigurationDefault;
import com.belatrix.test.java.Logger.Enum.LoggerTypes;
import com.belatrix.test.java.Logger.Factory.FactoryLogger;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerConsole;



public class TestConsoleLogger {
	
	@Before
	public final void baseSetUp() {}
	
	@After
	public final void baseTearDown() {}
	
	@Test
    public void testLoggerFactory_ConsoleType() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.CONSOLE.getType());
        assertEquals(true, logger instanceof ConsoleLogger);
    }
	
	@Test
    public void testConsoleManager_HandlerValid() {
		ManagerConsole managerConsole = ManagerConsole.getInstace(new ConfigurationDefault());
		assertNotNull(managerConsole.getConsoleHandler());
    }
	
	@Test
    public void testLoggerConsole_addMessageInfo() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.CONSOLE.getType());
		logger.addMessage("Console Test - Message Info ");
        assertEquals(true, logger instanceof ConsoleLogger);
    }
	
	@Test
    public void testLoggerConsole_addMultipleMessage() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.CONSOLE.getType());
		logger.addMessage("Test Multiple Console - Message Info!");
		logger.addWarning("Test Multiple Console - Message Warning!");
		logger.addError("Test Multiple Console - Message Error!");
        assertEquals(true, logger instanceof ConsoleLogger);
    }

}
