package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties ps;
	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream fis = new FileInputStream(f);
		 ps = new Properties();
		ps.load(fis);
		
	}
	
	public static String getBrowserName() {
		String browser = ps.getProperty("BrowserName");
		return browser;
	}
	
	
	public static String getUrl() {
		String url = ps.getProperty("url");
		return url;
	}
}
