package com.org.learnMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void Login() 
	{
		System.out.println("this is login method");
		WebDriver driver=new InternetExplorerDriver();
	}

}
