package com.bursys.org.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bursys.org.utilities.UtilitiesClass;

public class LandingPage extends UtilitiesClass {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//PageFactory Design 
	@FindBy(id="username")
	WebElement userID;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement submitBtn;
	
	
	public void loginApplication() {
		userID.sendKeys("acmeadmin");
		password.sendKeys("Bur$y$2023");
		submitBtn.click();
	}

}
