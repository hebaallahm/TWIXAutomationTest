package TestCases;

import org.openqa.selenium.WebDriver;

import pages.LeftMenu;
import pages.QuestionsPage;

public class QuestionsTC {
	
	public static void AddNewQuestion (WebDriver driver) throws InterruptedException {
		
			LeftMenu.SupervisorLink(driver).click();
			LeftMenu.QuestionsLink(driver).click();
			QuestionsPage.AddNewQuestion(driver).click();
			QuestionsPage.AddNewQName(driver).sendKeys("Do you find Fine products are well presented?");
			QuestionsPage.AddNewQName(driver).sendKeys("هل يتم عرض منتجات فاين بشكل جيد؟");
			QuestionsPage.ActiveCheckbox(driver).click();
			QuestionsPage.ExpirationDate(driver).sendKeys("12/12/2022");
			
			QuestionsPage.Savebutton(driver).click();
		
	}

}
