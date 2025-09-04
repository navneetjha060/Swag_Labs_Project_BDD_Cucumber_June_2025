package stepdefinitions;

import org.testng.Assert;

import BaseClass.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LogoutSteps extends BaseClass {

	HomePage homePage;

	LoginPage loginPage;

	@And("I click on Hamburger Menu")
	public void i_click_on_hamburger_menu() throws InterruptedException {

		homePage=new HomePage(driver);
		homePage.clickHamburgerMenu();
		Thread.sleep(2000);
	}

	@And("I click on Logout")
	public void i_click_on_logout() throws InterruptedException {
		loginPage = homePage.clickLogout();
		Thread.sleep(2000);
	}

	@Then("Validate I logged out successfully")
	public void validate_i_logged_out_successfully() {
		boolean res = loginPage.validateLoginPage();
		Assert.assertTrue(res);
		System.out.println("====Logout Validation Done======");
	}

}
