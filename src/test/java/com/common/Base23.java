package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base23 {


	public static WebDriver driver;

	public WebDriver getDriver() {//WebDriverManager » 3.7.1 plugins in pom.xml

		//System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
		//driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("a.i.jafri12@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Myheart1");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Account Settings")).click();
				driver.quit();
				
		
		 return driver;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
