package googlesearch;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageModel.googlepage;

public class Test1_search_POM {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		first_tc();
	}

	
	public static void first_tc() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.name("q")).sendKeys("Amazon India");
		googlepage.textbox_search(driver).sendKeys("Amazon India");
		
	
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		googlepage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		System.out.println("Success");
		
		
		
		
		
		
	}
}
