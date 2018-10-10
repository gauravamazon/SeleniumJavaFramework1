package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Salesforce_SIT_Extentreport_TestNG {
	// this class is created for extent report of google search
	
	WebDriver driver = null;
	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent = new ExtentReports();
	
	@BeforeSuite
	public void setup() {
	
        htmlReporter = new ExtentHtmlReporter("extent_google_testng.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);	
	}
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		ExtentTest test = extent.createTest("google search", "test for google search");
		
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Step1 passed");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("step2 passed");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		ExtentTest test = extent.createTest("google search2", "test for google search");
		driver.findElement(By.name("q")).clear();
		test.pass("step3 passed");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test.fail("step4 passed");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("step5 passed");
		Thread.sleep(3000);
		
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
