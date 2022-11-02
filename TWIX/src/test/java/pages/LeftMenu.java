package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftMenu {

	public static WebElement SupervisorLink (WebDriver driver)
	{
			WebElement supervisor = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
			return supervisor;
	}
	
	public static WebElement QuestionsLink (WebDriver driver)
	{
			WebElement Questions = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/ul[1]/li[4]/a[1]"));
			return Questions;
	}
	
	public static WebElement AccountReceivableLink (WebDriver driver)
	{
			WebElement AccountReceivable = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]/span[1]"));
			return AccountReceivable;
	}
	
	public static WebElement AccountReceivableSetupLink (WebDriver driver)
	{
			WebElement AccountReceivablesetup = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
			return AccountReceivablesetup;
	}
	
	public static WebElement EmployeeDefinitionLink (WebDriver driver)
	{
			WebElement EmployeeDefinition = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]"));
			return EmployeeDefinition;
	}
		
	
}
