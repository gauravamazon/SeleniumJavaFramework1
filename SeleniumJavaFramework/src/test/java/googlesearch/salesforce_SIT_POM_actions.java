package googlesearch;

import java.util.Iterator;


import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageModel.community;
import PageModel.Community_Obj_Actions;

public class salesforce_SIT_POM_actions {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		global_search();

	}
	
	public static void global_search() throws InterruptedException {
		
		driver = new ChromeDriver();
		String SIT = "https://amazon-hr--sit.cs96.my.salesforce.com/home/home.jsp";
		
		// refer from POM Package class
		Community_Obj_Actions CC = new Community_Obj_Actions(driver);
		
		
		driver.get(SIT);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		CC.search_input("Nimaa Aadan");
		//community.search_input(driver).sendKeys("Nimaa Aadan");
		//driver.findElement(By.id("phSearchInput")).sendKeys("Nimaa Aadan");
		Thread.sleep(3000);
		CC.search_button();
		//community.search_button(driver).click();
		//driver.findElement(By.id("phSearchButton")).click();
		Thread.sleep(3000);
		CC.contact_link();
		//community.contact_link(driver).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Nimaa Aadan')]")).click();
		Thread.sleep(3000);
		CC.manage_external_user();
		//community.manage_external_user(driver).click();
		//driver.findElement(By.id("workWithPortalButton")).click();
		Thread.sleep(3000);
		CC.login_community();
		//community.login_community(driver).click();
		//driver.findElement(By.name("networklogin")).click();
		Thread.sleep(5000);

		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator gk = windows.iterator();
		String mywindowID;
		while(gk.hasNext()) {
			mywindowID = gk.next().toString();
			System.out.println(mywindowID);
				driver.switchTo().window(mywindowID);
				
			
		}
		
		//Thread.sleep(3000);
		System.out.println("Success1");
		//CC.community_picklist();
		//community.community_picklist(driver).click();
		//driver.findElement(By.id("portalUserLoginAsSelect")).click();
		Thread.sleep(3000);
		System.out.println("Success2");
		//Select dropdown = new Select CC.community_picklist();
		//Select dropdown = new Select(community.community_picklist(driver));
		Select dropdown = new Select(driver.findElement(By.id("portalUserLoginAsSelect")));
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("Career Choice");
		Thread.sleep(3000);
		
		System.out.println("Success3");
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
		System.out.println("Success4");
		
		driver.close();
		
	}

}
