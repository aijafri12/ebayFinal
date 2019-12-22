package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");

		WebDriver driver= new FirefoxDriver();

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		Actions ac=new Actions(driver);
		
		
		WebElement mh=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
		mh.sendKeys(Keys.ENTER);
		
		WebElement fg=driver.findElement(By.xpath("//span[contains(text(),'Find a Gift')]"));
		ac.moveToElement(mh).moveToElement(fg).build().perform();
		ac.build().perform();
		
		
	}

}
