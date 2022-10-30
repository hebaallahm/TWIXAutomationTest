package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement Username (WebDriver driver)
	{
			WebElement username = driver.findElement(By.id("username"));
			return username;
	}
	
	public static WebElement Password (WebDriver driver)
	{
			WebElement password = driver.findElement(By.id("password"));
			return password;
	}
	
	public static WebElement BusinessUnit (WebDriver driver)
	{
			WebElement businessUnit = driver.findElement(By.id("k-fe60707f-7a3e-4530-9ceb-694b2081890a"));
			return businessUnit;
	}

	public static WebElement Language (WebDriver driver)
	{
			WebElement language = driver.findElement(By.id("7f1c9daa-349e-4eac-99dd-c2e155863f2c"));
			return language;
	}
	
	public static WebElement LoginButton (WebDriver driver)
	{
			WebElement loginbutton = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
			return loginbutton;
	}
	
	
}
