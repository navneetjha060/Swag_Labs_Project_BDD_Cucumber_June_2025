package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass;

public class LoginPage extends BaseClass {

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// By Locators
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");

	// Actions

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public HomePage clickLogin() {
		driver.findElement(loginButton).click();
		return new HomePage(driver);
		
		// Page Chaining
	}

}
