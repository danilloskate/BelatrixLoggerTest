package com.belatrix.test.java.Logger.Configuration;

import java.io.Serializable;

public abstract class Configuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2481930469539757191L;
	
	public abstract String getProperty(final String property);

}
