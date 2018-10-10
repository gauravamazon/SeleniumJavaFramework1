package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class community {
	private static WebElement element = null;
	
	public static WebElement search_input(WebDriver driver) {
		element = driver.findElement(By.id("phSearchInput"));
		return element;
	}
	
	public static WebElement search_button(WebDriver driver) {
		element = driver.findElement(By.id("phSearchButton"));
		return element;
	}
	
	public static WebElement contact_link(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Nimaa Aadan')]"));
		return element;
	}
	
	public static WebElement manage_external_user(WebDriver driver) {
		element = driver.findElement(By.id("workWithPortalButton"));
		return element;
	}
	
	public static WebElement login_community(WebDriver driver) {
		element = driver.findElement(By.name("networklogin"));
		return element;
	}
	
	public static WebElement community_picklist(WebDriver driver) {
		element = driver.findElement(By.id("portalUserLoginAsSelect"));
		return element;
	}
	
	public static WebElement career_choice_picklist(WebDriver driver) {
		element = driver.findElement(By.id("portalUserLoginAsSelect"));
		return element;
	}
	
	public static WebElement ok_button(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='loginAsPortalUserOverlayDialog_buttons']//input[@value='OK']"));
		return element;
	}
}
