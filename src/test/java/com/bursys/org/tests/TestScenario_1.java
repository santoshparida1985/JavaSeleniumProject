package com.bursys.org.tests;

import org.testng.annotations.Test;

import com.bursys.org.pageObjects.LandingPage;
import com.bursys.org.testComponents.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestScenario_1 extends BaseTest {
  @Test
  public void login(){
	  landingPage.loginApplication();
	  
  }
  


}
