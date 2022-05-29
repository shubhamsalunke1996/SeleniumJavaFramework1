package Test.SeleniumFrameWork;

import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import Demo.Log4J2PropertiesConf;
import OR.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	private static WebDriver driver=null;
	public static String browserName=null;
	private static Logger logger = LogManager.getLogger(Log4J2PropertiesConf.class);

	
	@BeforeTest
	public static void setupTest () {
		String projectpath=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver", projectpath+"\\drivers\\Edgedriver\\msedgedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
		
	
		logger.info("Browser statrted");
	}
	
	@Test
	public static void googleSearchText() {

		
		GoogleSearchPageObject searchPageObj=new GoogleSearchPageObject(driver);

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		searchPageObj.setTextInSearchBox("shubham");
		searchPageObj.clickSearchButton();
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties();
	}
}
