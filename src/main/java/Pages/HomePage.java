package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;

public class HomePage extends BaseClass {

	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// By Locators
	private By productsHeader = By.xpath("//span[text()=\"Products\"]");

	// Actions

	public boolean productsTextPresence() {

		return driver.findElement(productsHeader).isDisplayed();

		// Login Success check
	}

}
