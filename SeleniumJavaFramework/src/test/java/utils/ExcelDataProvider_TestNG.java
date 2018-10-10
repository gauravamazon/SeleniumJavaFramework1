package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider_TestNG {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		

	}

	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | " +password);
		driver.get("http://executeautomation.com/demosite/Login.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("UserName")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	}
	

	
	@DataProvider(name = "test1data")
	public Object[][] getData() {

		String excelpath = "C:\\Gaurav\\Automation\\Eclipse\\Workspace\\SeleniumJavaFramework\\excel\\data1.xlsx";
		Object data[][] = testData(excelpath, "Sheet1");
		return data;
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

	public static Object[][] testData(String excelpath, String sheetName) {

		ExcelUtilsGeneric excel = new ExcelUtilsGeneric(excelpath, sheetName);


		int RowCount = excel.getRowCount();
		int ColCount = excel.getColCount();

		Object data[][] = new Object[RowCount-1][ColCount];

		for(int i=1; i<RowCount; i++) {
			for(int j=0; j<ColCount; j++) {

				String celldata = excel.getCellDataString(i, j);
				//System.out.print(celldata+" | ");
				data[i-1][j] = celldata;		
			}
			//System.out.println();

		}
		return data;
	}

}
