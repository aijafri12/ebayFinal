 package com.ee.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyhomePage {

	public WebDriver driver;
	public MyhomePage (WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);//elemement loacator 
		
		
		
	
}
	
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement type;
	public WebElement type () {
		return type;
	
	
}
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement cl;
	public WebElement cl () {
		return cl;
	
	
}
	
	@FindBy(xpath="(//span[@class='cbx x-refine__multi-select-cbx'])[1]")
		
			
			
			
	WebElement pb;
	public WebElement pb () {
		return pb;
	
	
	}
	@FindBy(xpath="//img[@class = 's-item__image-img']")
	WebElement sl;
	public WebElement sl () {
		return sl;
	
	
	}
	
	@FindBy(linkText= "a[href='https://www.ebay.com/myb/WatchList']")
	WebElement wl;
	public WebElement wl () {
		return wl;
	}
}