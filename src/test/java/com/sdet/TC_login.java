package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_login 
{
	@Test
	public void login_Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationexercise.com/");
		
		WebElement webe1= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
		webe1.click();
		
		Assert.assertEquals(driver.getTitle(), "Login to your account");
		
		driver.close();
		
		
		
		
	}

}
