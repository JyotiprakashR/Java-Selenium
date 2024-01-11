package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonWebActions {
	
	public static void getURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static void getURLWithCreds(WebDriver driver, String url, String userName, String password) {
		String urls=url.substring(0, 8)+userName+":"+password+"@"+url.substring(8);
		driver.get(urls);
	}

	public static void fillText(WebDriver driver, String locator, String text) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	public static void clickElement(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public static boolean isDisplayed(WebDriver driver, String locator) {
		fluentWaitTillElementIsVisible(driver, Duration.ofSeconds(10), Duration.ofSeconds(10), locator);
		try {
			if (driver.findElement(By.xpath(locator)).isDisplayed()) {
				return true;
			} else
				return false;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static void fluentWaitTillElementIsVisible(WebDriver driver, Duration duration, Duration interval, String xpath) {
		FluentWait<WebDriver> fluentWait=new FluentWait<>(driver)
									.withTimeout(duration)
									.pollingEvery(interval)
									.ignoring(NoSuchElementException.class)
									.ignoring(ElementNotInteractableException.class);
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

}
