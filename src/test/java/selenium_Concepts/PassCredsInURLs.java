package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BasePage;
import constants.Constants;
import utilities.CommonWebActions;
import utilities.FileReaderUtil;

public class PassCredsInURLs extends BasePage{

	@Test
	public static void test() {
		//CommonWebActions.getURLWithCreds(driver, FileReaderUtil.getConfigProperty(Constants.PASS_CREDS_WITH_URL), "admin", "admin@123");
		
			
		// Bootstrap dropdown
		CommonWebActions.getURL(driver, "https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	
		for(WebElement ele:elements) {
			String ele1=ele.getAttribute("innerHTML");
			System.out.println(ele1);
		}
		
	}

}
