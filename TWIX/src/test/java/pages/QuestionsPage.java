package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsPage {

	
	public static WebElement AddNewQuestion (WebDriver driver)
	{
			WebElement addNewQuestion = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/app-screen[1]/div[2]/app-group-component[1]/div[1]/div[1]/div[1]/div[1]/app-grid[1]/kendo-grid[1]/kendo-grid-toolbar[1]/button[1]/i[1]\r\n"));
			return addNewQuestion;
	}
	
	public static WebElement AddNewQName (WebDriver driver)
	{
			WebElement addNewQName = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
			return addNewQName;
	}
	
	public static WebElement AddNewQAName (WebDriver driver)
	{
			WebElement addNewQAName = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
			return addNewQAName;
	}
	
	public static WebElement ActiveCheckbox (WebDriver driver)
	{
			WebElement ActiveCheckbox = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
			return ActiveCheckbox;
	}
	
	public static WebElement ExpirationDate (WebDriver driver)
	{
			WebElement ExpirationDate = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
			return ExpirationDate;
	}
	
	public static WebElement Savebutton (WebDriver driver)
	{
			WebElement Savebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/button[1]/i[1]"));
			return Savebutton;
	}
	
}
