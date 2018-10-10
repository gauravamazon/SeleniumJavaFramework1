package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport_google {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
	// start reporters
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreport.html");
		
    // create ExtentReports and attach reporter(s)
		
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("google search", "test for google search");
        
        driver = new ChromeDriver();
        test1.log(Status.INFO, "starting test case");
        driver.get("https://google.com");
        test1.pass("launched google.com");
        
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Keyboard input provided");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Enter Key pressed");
        Thread.sleep(3000);
        driver.close();
        test1.pass("closing browser");
        Thread.sleep(2000);
        driver.quit();
        test1.pass("quiting browser");
        // calling flush writes everything to the log file
        extent.flush();
        
	}

}
