package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.EmployeeDefinitionPage;
import pages.LeftMenu;

public class EmployeeDefinitionTC {
	
	public static void AccessEmployeeDefintion (WebDriver driver) throws InterruptedException {
		LeftMenu.AccountReceivableLink(driver).click();
		Thread.sleep(1000);
		LeftMenu.AccountReceivableSetupLink(driver).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-menu[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		LeftMenu.EmployeeDefinitionLink(driver).click();
	}
	
	
	
	public static void AddNewEmplpyee (WebDriver driver) throws InterruptedException {
		
		EmployeeDefinitionPage.AddEmployeeButton(driver).click();
		EmployeeDefinitionPage.NewEmployeeID(driver).sendKeys("2008");
		EmployeeDefinitionPage.NewEmployeeName(driver).sendKeys("Ismail Ibrahim");
		EmployeeDefinitionPage.NewEmployeeArName(driver).sendKeys("اسماعيل ابراهيم اسماعيل");
		EmployeeDefinitionPage.NewEmployeeSerialPrefix(driver).sendKeys("2008-12");
		EmployeeDefinitionPage.SaveButton(driver).click();
		
	}

}
