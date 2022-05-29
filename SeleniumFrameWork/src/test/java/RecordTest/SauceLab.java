package RecordTest;





import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class SauceLab {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("user-name")).clear();
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.xpath("//a[@id='item_4_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_0_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_1_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_5_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_2_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_3_title_link']/div")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.xpath("//a[@id='item_3_title_link']/div")).click();
    driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.linkText("6")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.id("first-name")).click();
    driver.findElement(By.id("first-name")).clear();
    driver.findElement(By.id("first-name")).sendKeys("pranav");
    driver.findElement(By.id("last-name")).click();
    driver.findElement(By.id("last-name")).clear();
    driver.findElement(By.id("last-name")).sendKeys("yadav");
    driver.findElement(By.id("postal-code")).click();
    driver.findElement(By.id("postal-code")).clear();
    driver.findElement(By.id("postal-code")).sendKeys("412307");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("finish")).click();
    driver.findElement(By.id("back-to-products")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}


