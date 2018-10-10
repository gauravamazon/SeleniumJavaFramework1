import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("ProjectPath :"+projectPath);
		
		// Chrome Driver --------------------------------
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver CDriver = new ChromeDriver();
		CDriver.get("https://google.com");
		
		// Firefox driver ----------------------------
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		//WebDriver FDriver = new FirefoxDriver();
		
		//FDriver.get("https://Katalon.com");
		
		// Internet Explorer Driver ------------------------
		
		//System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		
		//WebDriver IDriver = new InternetExplorerDriver();
		//IDriver.get("https://katalon.com");
		
		
		CDriver.manage().window().maximize();
		
		//Cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		//CDriver.findElement(By.name("q")).sendKeys("Amazon India");
		
		CDriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Amazon India");
		Thread.sleep(5000);
		
		List<WebElement> listOfElement = CDriver.findElements(By.xpath("//input"));
		int count = listOfElement.size();
		System.out.println("Count of input element is - "+count);
		
	
		CDriver.close();
	}

}
