package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_search {
	
	public static void main(String[] args) throws InterruptedException {
		
		first_tc();
	}

	
	public static void first_tc() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("q")).sendKeys("Amazon India");
		
	
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		System.out.println("Success");
		
		
		
		
		
		
	}
}
