package googlesearch;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PageModel.Community_Obj_Actions;

public class Extentreport_Salesforce_SIT_TestNG2_trial {
	// this class is created for extent report of Salesforce SIT with TestNG

	WebDriver driver = null;
	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent = new ExtentReports();


	@BeforeSuite
	public void setup() {

		htmlReporter = new ExtentHtmlReporter("extent_cc_sit_testng.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	
	}

	@BeforeTest
	public void beforetest() throws InterruptedException {
		driver = new ChromeDriver();
		String SIT = "https://amazon-hr--sit.cs96.my.salesforce.com/home/home.jsp";
		driver.get(SIT);
		Thread.sleep(3000);
		driver.manage().window().maximize();


	}

	@Test
	public void test1() throws InterruptedException {
		ExtentTest test = extent.createTest("global search", "test for global search");
		Community_Obj_Actions CC = new Community_Obj_Actions(driver);

		Thread.sleep(10000);
		CC.search_input("Nimaa Aadan");
		test.pass("Step1 pass");
		Thread.sleep(3000);
		CC.search_button();
		test.pass("Step2 pass");
		Thread.sleep(3000);
		CC.contact_link();
		test.pass("Step3 pass");
		Thread.sleep(3000);
		CC.manage_external_user();
		test.pass("Step4 pass");
		Thread.sleep(3000);
		CC.login_community();
		test.pass("test1 completed successfully");
		Thread.sleep(5000);

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator gk = windows.iterator();
		String mywindowID;
		while(gk.hasNext()) {
			mywindowID = gk.next().toString();
			System.out.println(mywindowID);
			driver.switchTo().window(mywindowID);	
			test.pass("switched to popup window");
			System.out.println("Switched to pop up window");
		}
		Select dropdown = new Select(driver.findElement(By.id("portalUserLoginAsSelect")));
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("Career Choice");
		Thread.sleep(3000);
		test.pass("able to select pick list value: Career Choice");
		System.out.println("Career Choice pick list value selected");

		CC.ok_button();
		test.pass("Test2 completed successfully");
		Thread.sleep(5000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		ExtentTest test = extent.createTest("community", "test for global search");
		
		//boolean x,y;
		//WebElement btn1 = driver.findElement(By.xpath("//section[@id='user-hero']//a[@class='btn-primary'][contains(text(),'Submit a tuition request now')]"));
		//WebElement btn2 = driver.findElement(By.xpath("//span[@id='j_id0:j_id38:j_id39:j_id64']"));
		
		if(driver.findElement(By.xpath("//section[@id='user-hero']//a[@class='btn-primary'][contains(text(),'Submit a tuition request now')]")).isDisplayed()){
			System.out.println("you are right");
		}else
			System.out.println("you are wrong");
		
		
		
		/*
		if(btn.isDisplayed()) {
			btn.click();
			System.out.println("Submit Application");
			test.pass("Application can be submitted");
			Thread.sleep(5000);
		}else
		
		x = btn1.isDisplayed();
		y = btn2.isDisplayed();
		System.out.println("value of x is "+x);
		System.out.println("value of y is "+y);
		if(x = true){

			btn1.click();
			System.out.println("Submit Application");
			test.pass("Application can be submitted");
			Thread.sleep(5000);
		}else if(y = true)
		{
			System.out.println("Application can not be submitted");
			test.fail("Application can not be submitted");
			Thread.sleep(5000);
		}
	*/
	
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}

	@AfterSuite	
	public void teardown() {
		extent.flush();
	}


}
