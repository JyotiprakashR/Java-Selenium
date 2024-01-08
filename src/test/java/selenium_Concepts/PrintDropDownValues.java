package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BasePage;
import constants.Constants;
import utilities.CommonWebActions;
import utilities.FileReaderUtil;

public class PrintDropDownValues extends BasePage {

	@Test(alwaysRun = false)
	public void tets() {
		CommonWebActions.getURL(driver, FileReaderUtil.getConfigProperty(Constants.FACEBOOK_URL));
		WebElement element = driver.findElement(By.xpath("//*[@id='month']"));

		Select select = new Select(element);

		select.selectByVisibleText("Aug");

		List<WebElement> monthList = driver.findElements(By.xpath("//*[@id='month']"));
		for (WebElement eachMonthElement : monthList) {
			System.out.println(eachMonthElement.getText());
		}
	}
	
	@Test(priority = 1)
	public void link() {
		System.out.println("lowercase link mehtod");
	}
	
	@Test(priority = 1)
	public void LINK() {
		System.out.println("uppercase link mehtod");
	}

}
