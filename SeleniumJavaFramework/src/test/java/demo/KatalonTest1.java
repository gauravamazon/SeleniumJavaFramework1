package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonTest1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testKatalonTest1() throws Exception {
		driver.get("http://executeautomation.com/demosite/Login.html");
		Thread.sleep(3000);
		assertTrue(isElementPresent(null));
		System.out.println("Element is Present "+isElementPresent(null));
		driver.findElement(By.name("UserName")).click();
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu'])[1]/following::span[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	 private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by.name("UserName"));
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
