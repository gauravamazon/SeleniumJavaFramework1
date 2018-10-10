package googlesearch;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageModel.googlepage;
import config.propertiesFile;

public class Test1_search_POM_properties {
	static WebDriver driver = null;
	public static String browserName = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		first_tc();
	}
	public static void first_tc() throws InterruptedException {
		propertiesFile.getproperties();
		
	
	if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
		Thread.sleep(5000);
		//driver.findElement(By.name("q")).sendKeys("Amazon India");
		googlepage.textbox_search(driver).sendKeys("Amazon India");
		
		Thread.sleep(3000);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		googlepage.button_search(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		driver.close();
		
		propertiesFile.setProperties();
		
		System.out.println("Success");
		
		
		
		
		
		
	}
}
