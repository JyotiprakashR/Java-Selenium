package selenium_Concepts;

import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class DropDownUsingJava8 {

	WebDriver driver;
	final String portal = "https://demoqa.com/select-menu";

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(portal);
	}

	@Test
	public void DropDownUsingJava8Test() {
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		//selectDropDownValue(element, "4");
		//Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		
		scrollTillCenter(element);
		// Using java-8
//		selectDropDown( (e)->{e.selectByVisibleText("Green");} , element);
//		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
//		selectDropDown(e->e.selectByValue("6"), element);
//		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
//		selectDropDown(e->e.selectByIndex(10), element);
		
		WebElement element1 = driver.findElement(By.id("cars"));
		List<WebElement> options=new Select(element1).getOptions();
		options.stream().forEach(e->e.click());
	}

	// Using java-8
	public void selectDropDown(Consumer<Select> consumer, WebElement element) {
		Select select= new Select(element);
		consumer.accept(select);
		
	}
	
	
	
	public void selectDropDownValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByIndex(Integer.parseInt(value));
	}
	public void scrollTillCenter(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	@AfterMethod
	public void tearDown() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		driver.quit();
		
	}

}
