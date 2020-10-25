package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	@Test(priority=1)
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
		
	}
	
	@Test(priority=2)
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test(priority=3)
	public void verifyUserPage() {
		driver.findElement(By.xpath("//span[text()='Users']")).click();	
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Use");
	}
}
