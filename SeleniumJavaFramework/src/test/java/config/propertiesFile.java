package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import googlesearch.Test1_search_POM_properties;

public class propertiesFile {
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {
		getproperties();
		setProperties();
		getproperties();

	}
	// setting up properties
	public static void getproperties() {
		try {
			//Properties prop = new Properties();
			//String projectpath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Test1_search_POM_properties.browserName=browser;

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			prop.setProperty("result", "pass");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}


	}
}
