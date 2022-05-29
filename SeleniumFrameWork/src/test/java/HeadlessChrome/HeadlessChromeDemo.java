package HeadlessChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
public static void main(String[] args) {
	test();
}
	
	public static void test() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1980,1080");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("Title  : "+driver.getTitle());
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
}
