import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver1 = new InternetExplorerDriver(caps);
		
		
		driver1.get("https://google.com");
		Thread.sleep(3000);
		driver1.findElement(By.name("q")).sendKeys("Gaurav");
		driver1.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver1.close();


	}

}
