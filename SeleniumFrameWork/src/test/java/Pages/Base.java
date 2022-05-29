package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	private static WebElement element=null;

	public static WebElement textbaoxSearch(WebDriver driver) {
		 element=driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement buttonSearch(WebDriver driver ) {
		
		element=driver.findElement(By.name("btnK"));
		return element;
	}
}
