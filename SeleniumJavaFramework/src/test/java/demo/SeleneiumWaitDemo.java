package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleneiumWaitDemo {

	public static void main(String[] args) throws Exception {
		seleniumWaits();

	}


	static WebDriver driver = null;
	public static void seleniumWaits() throws Exception {

		driver = new ChromeDriver();
		// This is implicit wait for entire session
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default frequency or poll time of implicit wait is 250ms

		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);

		// This is explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abar_button_opt")));
		element.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Turn on SafeSearch')]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
