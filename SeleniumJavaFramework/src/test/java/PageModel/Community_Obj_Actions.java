package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Community_Obj_Actions {
	WebDriver driver = null;
	
	By search_input 	= By.id("phSearchInput");
	By search_button 	= By.id("phSearchButton");
	By contact_link		= By.xpath("//a[contains(text(),'Nimaa Aadan')]");
	By manage_external_user = By.id("workWithPortalButton");
	By login_community 	= By.name("networklogin");
	By community_picklist = By.id("portalUserLoginAsSelect");
	By ok_button = By.xpath("//div[@id='loginAsPortalUserOverlayDialog_buttons']//input[@value='OK']");

	public Community_Obj_Actions(WebDriver driver) {
		this.driver = driver;
	}
	public void search_input(String text) {
		driver.findElement(search_input).sendKeys(text);
	}
	public void search_button() {
		driver.findElement(search_button).click();
	}
	public void contact_link() {
		driver.findElement(contact_link).click();
	}
	public void manage_external_user() {
		driver.findElement(manage_external_user).click();
	}
	public void login_community() {
		driver.findElement(login_community).click();
	}
	public void community_picklist() {
		driver.findElement(community_picklist).click();
	}
	public void ok_button() {
		driver.findElement(ok_button).click();

	}
}
