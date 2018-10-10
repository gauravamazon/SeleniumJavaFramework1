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

import PageModel.community;
import PageModel.Community_Obj_Actions;

public class salesforce_SIT_POM_actions_TestNG {
	
	private static WebDriver driver = null;
	
	@BeforeTest
	public void initializing_SIT() {
		driver = new ChromeDriver();
		String SIT = "https://amazon-hr--sit.cs96.my.salesforce.com/home/home.jsp";

		driver.get(SIT);
		driver.manage().window().maximize();
	}
	
	@Test
	public void global_search() throws InterruptedException {
	// refer from POM Package class
	Community_Obj_Actions CC = new Community_Obj_Actions(driver);
		
		Thread.sleep(10000);
		CC.search_input("Nimaa Aadan");

		Thread.sleep(3000);
		CC.search_button();

		Thread.sleep(3000);
		CC.contact_link();

		Thread.sleep(3000);
		CC.manage_external_user();

		Thread.sleep(3000);
		CC.login_community();

		Thread.sleep(5000);

		// Switching to popup window --------------
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
		//CC.community_picklist();
		
		// Selecting Career Choice from Pick list on pop up window----------------
		//Select dropdown = new Select CC.community_picklist();
		Select dropdown = new Select(driver.findElement(By.id("portalUserLoginAsSelect")));
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("Career Choice");
		Thread.sleep(3000);
		
		System.out.println("Career Choice pick list value selected");
		
		CC.ok_button();
		//WebElement button = community.ok_button(driver);
		//WebElement button = driver.findElement(By.xpath("//div[@id='loginAsPortalUserOverlayDialog_buttons']//input[@value='OK']"));
		
		/*
		boolean x;
	
		x = button.isEnabled();
		if (x = true){
			System.out.println("button is clickable");
		}
		else
			System.out.println("button is not clickable");
		
		Thread.sleep(5000);
		button.click();
		*/
		
		Thread.sleep(5000);
		System.out.println("Exting from Pop up window");
	}
		@AfterTest
		public void teardowntest() {
		driver.close();
		System.out.println("Browser closed successfully");
		
	}

}
