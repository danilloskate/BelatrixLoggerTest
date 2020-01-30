package com.belatrix.test.java.TestLoggerBelatrix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.belatrix.test.java.Logger.FileLogger;
import com.belatrix.test.java.Logger.Configuration.ConfigurationDefault;
import com.belatrix.test.java.Logger.Enum.LoggerTypes;
import com.belatrix.test.java.Logger.Factory.FactoryLogger;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerFile;



public class TestFileLogger {
	
	@Before
	public final void baseSetUp() {}
	
	@After
	public final void baseTearDown() {}
	
	@Test
    public void testLoggerFactory_FileType() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.FILE.getType());
        assertEquals(true, logger instanceof FileLogger);
    }
	

	@Test
    public void tesManagerFile() {
		ManagerFile fileManager = new ManagerFile(new ConfigurationDefault());
		assertNotNull(fileManager.getFileHandler());
    }
	
	@Test
    public void testFileLogger_addMessage() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.FILE.getType());
		logger.addMessage("Test - Info Message ");
        assertEquals(true, logger instanceof FileLogger);
    }
	
	@Test
    public void testLoggerFile_addMultipleMessage() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.FILE.getType());
		logger.addMessage("Test Multiple - Message Info");
		logger.addWarning("Test Multiple - Message Warning");
        assertEquals(true, logger instanceof FileLogger);
    }

}
