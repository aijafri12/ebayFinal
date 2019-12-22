package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		Select sl=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		sl.getFirstSelectedOption().click();
		sl.selectByVisibleText("Electronics");
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: Element <option> could not be scrolled into view
		//it's a firefox browser  problem//can not be fixed by the coder
	
		
		
		
		
		
	}

}
