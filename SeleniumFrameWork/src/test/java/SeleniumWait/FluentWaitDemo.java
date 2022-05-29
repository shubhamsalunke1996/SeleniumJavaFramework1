package SeleniumWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static void test() throws InterruptedException {


		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		


		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				WebElement linkElement= driver.findElement(By.xpath("//h3[text()='English Alphabet | A for apple | एबीसीडी | abcd varnamala letter']"));

				if(linkElement.isEnabled()) {
					System.out.println("Element found");
				}
				return linkElement;
			}
		});

		element.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
