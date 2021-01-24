package com.yahooMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/chromedriver83v");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
//		driver.findElement(By.id("header-signin-link")).click();
		driver.findElement(By.id("login-username")).sendKeys("ayotomjoeph@yahoo.com"); 
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("pure-button puree-button-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("pure-button puree-button-primary validate-btn")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.className("")).click();
		String at = driver.getTitle();
		String et = "gmail";
		System.out.println(at);
		Thread.sleep(2000);
		
		if (at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Fail");
		}
	

	}

}
