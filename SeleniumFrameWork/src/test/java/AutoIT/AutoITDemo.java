package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}

	public static void test() throws IOException, InterruptedException {

		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions mouse=new Actions(driver);
		WebElement upload=driver.findElement(By.xpath("/html/body/form/input[1]"));
		mouse.moveToElement(upload).click().build().perform();
		//upload.sendKeys("D:\\pranav resume\\File2.txt");
		
		
	
		Runtime.getRuntime().exec("D:\\pranav resume\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		WebElement press=driver.findElement(By.xpath("/html/body/form/input[3]"));
		mouse.moveToElement(press).click().build().perform();
		driver.close();
	}

}
