package Test.SeleniumFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OR.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSeachPageTest {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchText();

	}

	public static void googleSearchText() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		GoogleSearchPageObject searchPageObj=new GoogleSearchPageObject(driver);

		driver.get("https://www.google.com");
		searchPageObj.setTextInSearchBox("shubham");
		searchPageObj.clickSearchButton();
		driver.close();
	}
}
