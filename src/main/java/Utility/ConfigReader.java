package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import TestCases.LoginPageTest;

public class ConfigReader {
	static Properties prop = new Properties();
	
	public static Properties getProp() {
		return prop;
	}
	public static void setProp(Properties prop) {
		ConfigReader.prop = prop;
	}
	public static void main(String[] args)
	{
		readPropertiesFile();
		writePropertiesFile();
		//readPropertiesFile();
		
	}
	public static void readPropertiesFile()
	{
		
		try
		{
			InputStream input = new FileInputStream("config.properties");
			prop.load(input);
			setProp(prop);
			System.out.println(prop.getProperty("browser"));
			LoginPageTest.browser = prop.getProperty("browser");
			System.out.println(LoginPageTest.browser);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void writePropertiesFile()
	{
		try 
		{
			OutputStream output = new FileOutputStream("D:\\Work-space\\maven-demo\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("result", "Pass");
			prop.store(output, "comments");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
