package stepdefinitions;

import org.testng.Assert;

import BaseClass.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;

	@Given("I open the Saucedemo login page")
	public void open_login_page() {
		
		loginPage = new LoginPage(driver);
		System.out.println("===== Application is Up and Running=======");

	}

	// Code for standard_user login
	@When("I enter username standard user")
	public void enter_username() {

		loginPage.enterUsername("standard_user");
		System.out.println("Username Entered");
	}
	
	// Code for Multiple Login
	@When("I enter {string}")
	public void enter_username(String Uname) {

		loginPage.enterUsername(Uname);
		System.out.println("Username Entered");
	}

	@And("I enter password")
	public void enter_password() {
		loginPage.enterPassword("secret_sauce");
		System.out.println("Password Entered");
	}

	@And("I click the login button")
	public void click_login_button() {
		homePage=loginPage.clickLogin();
		System.out.println("Login Clicked");
	}

	@Then("I should see the Products page")
	public void verify_products_page() {
		Boolean result=homePage.productsTextPresence();
		Assert.assertTrue(result);
		System.out.println("Verification Done");
		teardown();
	}

}
