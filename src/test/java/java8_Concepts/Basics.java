package java8_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics {

//	private WebDriver driver;
//	private String browserName = "Chrome";
//
	private final String portalUrl = "https://www.t-mobile.com";

	@Test
	public void testBasics() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(portalUrl);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

					allLinks.stream()
								.map(e -> e.getText())
								.filter(s->! s.isBlank())
								.distinct()
								.sorted()
								.filter(s -> s.startsWith("C") || s.startsWith("D"))
								.forEach(System.out::println);
	}
}

//Open any portal
//Fetch all the links in the amazon.in home page.
//Fetch the text from the links and remove the empty links
//Remove the duplicates.
//Sort the text in the alphabetical order.
//Print only the text starting with character “C” and “D”

