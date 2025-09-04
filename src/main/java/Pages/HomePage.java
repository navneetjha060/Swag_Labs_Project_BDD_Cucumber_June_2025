package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BaseClass;

public class HomePage extends BaseClass {

	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// By Locators
	private By productsHeader = By.xpath("//span[text()=\"Products\"]");

	private By hamburgerMenu = By.xpath("//button[text()=\"Open Menu\"]");
	
	private By logoutBtn = By.id("logout_sidebar_link");
	

	// Actions

	public boolean productsTextPresence() {

		return driver.findElement(productsHeader).isDisplayed();

		// Login Success check
	}
	
	
	public void clickHamburgerMenu() {
		
		driver.findElement(hamburgerMenu).click();
	}
	
	public LoginPage clickLogout() {
		driver.findElement(logoutBtn).click();
		return new LoginPage(driver);
	}

}
