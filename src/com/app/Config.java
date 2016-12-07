package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	private static Properties prop = null;
	private static String filename = "config.properties";

	public static String getProperty(String s) throws IOException {
		InputStream in = null;

		if (prop == null) {
			in = new FileInputStream(filename);
			prop = new Properties();

			prop.load(in);
		}

		return prop.getProperty(s);
	}
}
