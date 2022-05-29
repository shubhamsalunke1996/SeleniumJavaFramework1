package Test.SeleniumFrameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemowithTestNG {

	 ExtentReports extent;
	 WebDriver driver;

	@BeforeSuite
	public void setup() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("shubham.html");
		extent.attachReporter(spark);
	
	}
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
	}
	
	@Test
	public void test1() {
		
		ExtentTest test1=extent.createTest("MyFirstTest", "this is a test to valiadate google search functionality");
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test1.pass("Navigated to google.com");
		test1.log(Status.INFO,"Starting Test Case");
		test1.info("This step shows usage of info(details)");
		
		test1.pass("Enterd text in searchbox");
		test1.pass("Pressed keyboard enter key");
		
	
		test1.pass("close the browser");
		test1.pass("Test Completed");
		test1.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void afterTest() {
	driver.close();
	driver.quit();
	System.out.println("Test Completed successfully");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
