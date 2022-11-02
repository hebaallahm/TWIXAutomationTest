package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = fun_startBrowser("https://bifmcg.bi-technologies.net/uiuat/#/login");
		Thread.sleep(3000);
		LoginTC.Login(driver);
		Thread.sleep(3000);
	//	QuestionsTC.AddNewQuestion(driver);
		EmployeeDefinitionTC.AccessEmployeeDefintion(driver);
		Thread.sleep(3000);
		EmployeeDefinitionTC.AddNewEmplpyee(driver);
		Thread.sleep(3000);
		closeBrowser();
			
	}
	
	public static WebDriver fun_startBrowser (String url)
	{
		System.setProperty("webdriver.chrome.driver","E:\\TWIXAutomation\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get(url);
		 return driver;

	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
