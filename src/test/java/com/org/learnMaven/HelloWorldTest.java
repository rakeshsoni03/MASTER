package com.org.learnMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void Login() 
	{
		System.out.println("this is login method");
		String executionPath = System.getProperty("user.dir");
		System.out.println("path is "+executionPath);
		System.setProperty("webdriver.ie.driver", executionPath+"\\"+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://coindelta.com/market/?active=XRP-INR");
		driver.findElement(By.xpath("//*[@id='market']/section/div[2]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[6]/td[1]")).click();
		
	}

}
