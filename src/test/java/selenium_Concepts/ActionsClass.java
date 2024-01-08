package selenium_Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BasePage;

public class ActionsClass extends BasePage {

	public static void test() {

		Actions action = new Actions(driver);
		action.keyDown(Keys.NUMPAD2).build().perform();

	}

	@Test
	public static void test1() {

		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\HP\\Desktop\\RPA.html");

		Alert alert= driver.switchTo().alert();
	}

}
