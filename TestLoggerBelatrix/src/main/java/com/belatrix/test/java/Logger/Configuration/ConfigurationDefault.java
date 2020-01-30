package com.belatrix.test.java.Logger.Configuration;

public class ConfigurationDefault extends Configuration {

	/**
	 * 
	 */
	private static final long serialVersionUID = 169610332919801423L;

	@Override
	public String getProperty(final String property) {
		String message = null;
		if (property.equals("logger.FilePath")) {
			message = "./file/logFile.txt";
		} else if (property.equals("BD.Logger.UsserName")) {
			message = "administrador";
		} else if (property.equals("BD.Logger.Password")) {
			message = "12345";
		} else if (property.equals("BD.Logger.jdbcDriver")) {
			message = "oracle.jdbc.driver.OracleDriver";
		} else if (property.equals("BD.Logger.dbUrl")) {
			message = "jdbc:oracle:./file/BdBelatrix";
		}

		return message;
	}

}
