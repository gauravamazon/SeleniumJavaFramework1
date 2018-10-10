package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) throws Exception {
		headless();
	}
	
	
	public static void headless() throws Exception {
		
		WebDriver driver = null;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1920,1080");
		
		//Calling headless Chrome driver
		driver = new ChromeDriver(options);
		
		driver.get("http://executeautomation.com/demosite/Login.html");
		System.out.println("URL Opened");
		driver.findElement(By.name("UserName")).sendKeys("Admin");
		System.out.println("Username entered");
		driver.findElement(By.name("Password")).sendKeys("Admin");
		System.out.println("Password entered");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("Logged In");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='Login.html']")).click();
		System.out.println("Logged Out");
		driver.close();
		System.out.println("Browser Closed");
		driver.quit();
		System.out.println("Completed");
	}

}
