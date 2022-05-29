package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.TestNG;

import Test.SeleniumFrameWork.TestNG_Demo;


public class PropertiesFile {
	//public static String browserName=null;
	static Properties prop=new Properties();

	static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties()  {



		try {
			InputStream input=new FileInputStream(projectpath+"\\src\\test\\java\\Config\\Config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {

				e.printStackTrace();
			}
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName=browser;
		

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			e.printStackTrace();
		}


	}
	public static void setProperties() {
		try {
			OutputStream output=new FileOutputStream(projectpath+"\\src\\test\\java\\Config\\Config.properties");
			prop.setProperty("result", "pass");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
}
