package com.belatrix.test.java.TestLoggerBelatrix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.belatrix.test.java.Logger.DataBaseLogger;
import com.belatrix.test.java.Logger.Configuration.ConfigurationDefault;
import com.belatrix.test.java.Logger.Enum.LoggerMessageTypes;
import com.belatrix.test.java.Logger.Enum.LoggerTypes;
import com.belatrix.test.java.Logger.Factory.FactoryLogger;
import com.belatrix.test.java.Logger.Interfaces.LoggerBelatrixI;
import com.belatrix.test.java.Logger.Manager.ManagerDataBase;



public class TestDataBaseLogger {
	

	@Before
	public final void baseSetUp() {}
	
	@After
	public final void baseTearDown() {}
	
	@Test
    public void testFactoryLogger_DatabaseType() throws Exception {
		LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.DATABASE.getType());
        assertEquals(true, logger instanceof DataBaseLogger);
    }
	
	@Test
    public void testManagerDatabe_ConecctionBD() {
		ManagerDataBase managerBD = ManagerDataBase.getInstance(new ConfigurationDefault());
		try {
			assertTrue(managerBD.getConnection().isValid(0));
		} catch (SQLException e) {
			assertTrue(false);
		}
    }
	
	@Test
    public void testDatabaseManager_insertMessage() {
		try {
			ManagerDataBase managerBD = ManagerDataBase.getInstance(new ConfigurationDefault());
			managerBD.insertMessageBD("Test insert Data Base Message", LoggerMessageTypes.MESSAGE.getId());
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
    }
	
	@Test
    public void testLoggerDatabase_addLog() {
		try {
			LoggerBelatrixI logger = FactoryLogger.getLogger(LoggerTypes.DATABASE.getType());
			logger.addMessage("Test Multiple - Message Info");
			logger.addWarning("Test Multiple - Message Warnings");
	        assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
    }

}
