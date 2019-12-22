package com.ee.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	
	WebDriver driver;
	public DropDown1(WebDriver driver) {
		
		
		this.driver=driver;
		PageFactory.initElements(driver,this); 
		
	
}
	public void click() {
	
		
		Select All = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
	
		
		All.selectByVisibleText("Books");
	All.getFirstSelectedOption();
	
	
	
	
	
	
	}

}
