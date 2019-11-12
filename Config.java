package com.Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Config 
{
public static String FW_ROOT = System.getProperty("user.dir");
	
	public static int TIME_OUT_MID = 5;
	public static int TIME_OUT_MIN = 1;
	public static int TIME_OUT_MAX = 10;


	
	public static String FetchConfigData(String config_key) throws IOException {
		HashMap<String,String> hm = new HashMap<String,String>();
		//Read the Config
		Properties p = new Properties();
		InputStream s = null;
		//File f=new File();
		s = new FileInputStream("config.properties");
		p.load(s);

		Enumeration<?> e  = p.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String val = p.getProperty(key);
			hm.put(key, val);

		}
		
		return hm.get(config_key);

	}//end method


}
