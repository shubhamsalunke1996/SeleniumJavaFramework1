package Test.SeleniumFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	private static WebDriver driver=null;
	
    public static void main(String[] args) throws ClassNotFoundException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
        extent.attachReporter(spark);
        
        ExtentTest test1=extent.createTest("Google Search Test One", "this is a test to valiadate google search functionality");
        WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		test1.log(Status.INFO,"Starting Test Case");
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("shubham");
		test1.pass("Enterd text in searchbox");
	
		driver.findElement(By.name("btnK")).click();
		test1.pass("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test1.pass("close the browser");
		test1.pass("Test Completed");
		extent.flush();
        
       // extent.createTest("ScreenCapture")
       // .addScreenCaptureFromPath("extent.png")
       // .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());


		

	}

}
