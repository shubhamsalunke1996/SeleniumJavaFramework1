package Test.SeleniumFrameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> listofe=driver.findElements(By.xpath("//input"));
		int a=listofe.size();
		System.out.println("list of element |"+a);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int b=links.size();
		System.out.println("links element |"+b);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("shubham salunke");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		driver.close();
	}
}
