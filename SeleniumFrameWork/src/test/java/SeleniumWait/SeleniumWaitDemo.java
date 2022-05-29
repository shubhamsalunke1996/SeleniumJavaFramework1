package SeleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {

	private static final WebDriver driver = null;

	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static  void seleniumWaits() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default frequency of polling is 250ms(default frequency of poll time)
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("shubham salunke");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}
}
