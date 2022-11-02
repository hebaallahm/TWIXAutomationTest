package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTC {
	
	public static void Login (WebDriver driver) throws InterruptedException {
		
		LoginPage.Username(driver).sendKeys("root");
		LoginPage.Password(driver).sendKeys("123");
		LoginPage.Password(driver).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		LoginPage.Password(driver).sendKeys(Keys.ENTER);		
		driver.manage().window().maximize();
	}

}
