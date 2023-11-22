package selenium_Concepts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	@Test
	public void Launch_BrowserTest() throws InterruptedException {
		// using WebDriverManager to launch browser
		// C:\Users\HP\.cache\selenium---In this path WDM store the downloaded .exe file
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
	}

	@Test()
	public void Launch_BrowserTest1() throws InterruptedException {
		// using SeleniumManager to launch browser
		// C:\Users\HP\.cache\selenium---In this path SM store the downloaded .exe file
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.com");

	}
	
	@Test
	public void Launch_BrowserTest2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");

	}
}
