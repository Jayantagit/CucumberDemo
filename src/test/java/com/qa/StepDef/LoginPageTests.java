package com.qa.StepDef;

import java.util.concurrent.TimeUnit;

import com.qa.Base.BasePage;
import com.qa.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTests extends BasePage 
{
	private BasePage base;
	LoginPage login;

	public LoginPageTests(BasePage base) {
		this.base = base;
	}
	

	@Given("User is already in the LoginPage")
	public void user_is_already_in_the_login_page() {
		
		base.driver.get("https://app.hubspot.com/login");
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User enter the wrong {string} And User enter the wrong {string}")
	public void user_enter_the_wrong_and_user_enter_the_wrong(String uname, String password) {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login=new LoginPage(this.base);
		login.doLogin(uname, password);

	}

	@Then("Error message will appear")
	public void error_message_will_appear() {
		
		

	}

}
