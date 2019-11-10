package com.Product.ReUsable;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_File 
{
	public static String getProperty(String key)
	{
		String propertyfilepath="../Automation_Framework/Cofig.Properties";
		Properties p=new Properties();
		try
		{
			FileInputStream file=new FileInputStream(propertyfilepath);
			p.load(file);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
}

