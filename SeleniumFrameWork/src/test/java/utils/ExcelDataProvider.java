package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	static WebDriver driver;

	@BeforeTest 
	public static void setupTest () {
		//String projectpath=System.getProperty("user.dir"); 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}


	@Test(dataProvider = "test1data")
	public void test1(String username,String password) throws InterruptedException {

		System.out.println(username+ "   "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000); 
		driver.findElement(By.id("btnLogin")).click();

	}



	@DataProvider(name= "test1data")
	public Object[][] getData() {
		String excelPath="C:\\Users\\yadav\\Documents\\SeleniumFrameWork\\excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;

	}

	public Object[][] testData(String excelPath,String sheetName) {

		ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		Object data[][]=new Object[rowCount-1][colCount];

		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData=excel.getCellDataString(i, j);
				//System.out.print(cellData+"   |  "  );
				data[i-1][j]=cellData;
			}
			//System.out.println();
		}
		return data;
	}
	@AfterTest
	public static void closeBrowser() {
	driver.close();	
	}
}
