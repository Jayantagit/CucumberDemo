package com.qa.Pages;

import org.openqa.selenium.By;
import com.qa.Base.BasePage;


import io.qameta.allure.Step;

public class LoginPage extends BasePage
{
	private BasePage base;
     	
	By emailId = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	By signUpLink = By.linkText("Sign up");
	
	
	public LoginPage(BasePage base) {
		this.base=base;
	}
	
	@Step("login with : {0} and {1}")
	public void doLogin(String username, String pwd) {
		System.out.println("login with : " + username + " : " + pwd);
		base.driver.findElement(emailId).sendKeys(username);
		base.driver.findElement(password).sendKeys(pwd);
		base.driver.findElement(loginButton).click();
	
	}
	
}
