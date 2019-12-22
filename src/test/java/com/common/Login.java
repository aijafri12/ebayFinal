package com.common;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.Permissions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login  {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);



		

	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("a.i.jafri12@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Myheart1");
	driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
	//driver.findElement(By.className("//span[@class=\"_1vp5\"]"));
	//driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("ahmed");
	 Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("ahmed");
driver.findElement(By.xpath("//i[@class=\"_585_\"]")).click();

driver.quit();
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
