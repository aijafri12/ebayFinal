package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseCrossBrowser {

	
	private static String getURl="https://amazon.com";
	public static String getGetURL() {
	return getURl;
	
	
	
}
	WebDriver driver;
	
	public static WebDriver getBrowser(String BrowserName, WebDriver driver) {
		if(BrowserName.equalsIgnoreCase("opera")){
		
		System.setProperty("Webdriver.opera.driver","./Driver/operadriver");
		driver=new OperaDriver();
		
		
		
		}
		else if (BrowserName.equalsIgnoreCase("geckodriver")) {
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
		driver = new FirefoxDriver();
				
		
		
		}
		
		
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
