package Test.SeleniumFrameWork;

import java.time.Duration;

import Pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	private static WebDriver driver=null;
	public static void main(String[] args) {

		googleSearch();

	}

	public static void googleSearch() {

		String projectPath=System.getProperty("user.dir");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Base.textbaoxSearch(driver).sendKeys("shubham");
		Base.buttonSearch(driver).sendKeys(Keys.ENTER);
		
		driver.close();



	}
}
