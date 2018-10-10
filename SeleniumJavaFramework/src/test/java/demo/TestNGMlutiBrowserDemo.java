package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMlutiBrowserDemo {

	WebDriver driver = null;
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName) {
		
		System.out.println("Browser is :"+BrowserName);
		System.out.println("thread id is "+Thread.currentThread().getId());
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}
		
	}
	
	@Test
	public void test() throws Exception {
		
		driver.get("https://google.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		
		
	}
}
