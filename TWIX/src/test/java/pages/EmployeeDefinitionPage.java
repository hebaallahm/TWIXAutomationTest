package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeDefinitionPage {
	
	public static WebElement AddEmployeeButton (WebDriver driver)
	{
			WebElement AddEmployee = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/app-screen[1]/div[1]/div[2]/app-action-buttons[1]/div[1]/div[1]/app-action[1]/button[1]/i[1]"));
			return AddEmployee;
	}
	
	public static WebElement NewEmployeeID (WebDriver driver)
	{
			WebElement NewEmployeeID = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
			return NewEmployeeID;
	}
	
	public static WebElement NewEmployeeName (WebDriver driver)
	{
			WebElement NewEmployeeName = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
			return NewEmployeeName;
	}
	
	public static WebElement NewEmployeeArName (WebDriver driver)
	{
			WebElement NewEmployeeArName = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
			return NewEmployeeArName;
	}
	
	public static WebElement NewEmployeeSerialPrefix (WebDriver driver)
	{
			WebElement NewEmployeeSerialPrefix = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
			return NewEmployeeSerialPrefix;
	}
	
	public static WebElement SaveButton (WebDriver driver)
	{
			WebElement SaveButton = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/app-screen[1]/div[1]/div[2]/app-action-buttons[1]/div[1]/div[1]/app-action[2]/button[1]/i[1]"));
			return SaveButton;
	}
	
	
	
	
	
	

}
