package com.bursys.org.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bursys.org.utilities.UtilitiesClass;

public class HomePage extends UtilitiesClass {
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//PageFactory Design 
		@FindBy(xpath="//a[@id='Customer_menu']//i")
		WebElement customersDropdown;
		
		public void clickCustomersDropdown()
		{
			customersDropdown.click();
		}

}
