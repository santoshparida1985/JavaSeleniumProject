package com.bursys.org.testComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bursys.org.pageObjects.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public String url;
	public LandingPage landingPage;

	public WebDriver initializeDriver() {
		
		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//bursys//org//Resources//GlobalData.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return driver;
		
	}
	
	@BeforeMethod
	public LandingPage launchApplication(){
		
		driver = initializeDriver();
		driver.get("https://sqa.fieldequip.com/#/login");
		landingPage = new LandingPage(driver);
		return landingPage;
		 
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
