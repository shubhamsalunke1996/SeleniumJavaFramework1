package Test.SeleniumFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	private static WebDriver driver;
	@Test
	public void setUpTest() {
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver(caps);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("shubham");
		driver.findElement(By.name("btnK")).click();
		driver.close();
		driver.quit();

	
	}
	

}
