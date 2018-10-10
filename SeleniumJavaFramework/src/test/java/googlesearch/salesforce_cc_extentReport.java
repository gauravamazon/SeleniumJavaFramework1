package googlesearch;

import java.util.Iterator;


import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PageModel.community;
import PageModel.Community_Obj_Actions;

public class salesforce_cc_extentReport {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// start reporters
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("cc_extentreport.html");
		
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest cctest = extent.createTest("login to community", "test for login into cc community");
        
    		driver = new ChromeDriver();
    		String SIT = "https://amazon-hr--sit.cs96.my.salesforce.com/home/home.jsp";
    		cctest.info("Opening SIT");
    		driver.get(SIT);
    		
    		driver.manage().window().maximize();
    		System.out.println("SIT Org opened successfully");
    		cctest.pass("SIT Launched");
    		
    		Thread.sleep(5000);
    		driver.findElement(By.id("phSearchInput")).sendKeys("Nimaa Aadan");
    		Thread.sleep(3000);
    		driver.findElement(By.id("phSearchButton")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[contains(text(),'Nimaa Aadan')]")).click();
    		cctest.pass("Contact found after gobal search");
    		cctest.info("Login to CC Community");
    		Thread.sleep(3000);
    		driver.findElement(By.id("workWithPortalButton")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.name("networklogin")).click();
    		Thread.sleep(3000);
    		
    		// Switching to popup window --------------
    		cctest.info("Swtiching to pop up window");
    		Set<String> windows = driver.getWindowHandles();
    		System.out.println(windows.size());
    		
    		Iterator gk = windows.iterator();
    		String mywindowID;
    		while(gk.hasNext()) {
    			mywindowID = gk.next().toString();
    			System.out.println(mywindowID);
    				driver.switchTo().window(mywindowID);	
    		}
    		
    		System.out.println("Switched to pop up window");
    		cctest.pass("Switched to pop up window");
    		Select dropdown = new Select(driver.findElement(By.id("portalUserLoginAsSelect")));
    		dropdown.selectByIndex(2);
    		dropdown.selectByVisibleText("Career Choice");
    		Thread.sleep(3000);
    		
    		System.out.println("Career Choice pick list value selected");
    		cctest.pass("Career Choice is selected from dropdown");
    		driver.findElement(By.xpath("//div[@id='loginAsPortalUserOverlayDialog_buttons']//input[@value='OK']")).click();
    		Thread.sleep(5000);
    		cctest.pass("Landed on CC Community Page");
    		driver.close();
    		extent.flush();
    		
	}
}
