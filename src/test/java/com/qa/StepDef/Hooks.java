package com.qa.StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Base.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks 
{
	private BasePage base;

	public Hooks(BasePage base) {		
		this.base = base;
	}
	
	@Before
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		base.driver=new ChromeDriver();
		
	}
	
	@After
	public void tearDown()
	{
		
		base.driver.close();
		
	}
	
	

}
