import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
	
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("a.i.jafri12@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("myheart1");
		
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
		

	}

}
