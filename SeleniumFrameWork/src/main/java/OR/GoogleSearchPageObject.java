package OR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver=null;
	
	By textBoxSearch=By.name("q");
	//By buttonSearch=By.name("btnK");
	By buttonSearch=By.xpath("//input[@class='gLFyf gsfi']");
	
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void setTextInSearchBox(String text) {
	driver.findElement(textBoxSearch).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(buttonSearch).sendKeys(Keys.ENTER);
	}
}
