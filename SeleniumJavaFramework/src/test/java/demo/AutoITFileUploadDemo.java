package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITFileUploadDemo {

	public static void main(String[] args) throws Exception {
	fileupload();

	}
	
	static WebDriver driver = null;
	public static void fileupload() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.get("http://tinyupload.com");
		driver.findElement(By.name("uploaded_file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Gaurav\\Automation\\AutoIT1.exe");
		Thread.sleep(3000);
		System.out.println("file uploaded");
		driver.close();
		
		
	}

}
