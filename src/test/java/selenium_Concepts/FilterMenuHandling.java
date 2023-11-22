package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilterMenuHandling {

	private WebDriver driver;
	private String browserName = "Chrome";
	private final String portalUrl = "https://www.t-mobile.com/tablets";

	@BeforeTest
	private void setUp() throws InterruptedException {
		launchBrowser(browserName);
		launchPortal(portalUrl);
	}
	
	@Test
	private void FilterMenuHandlingTest() throws Exception {
		selectFilter("Deals", "New");
//		selectFilter("Operating System", "Android");
//		selectFilter("Operating System", "Android", "Other");
//		selectFilter("Brands", "Apple");
//		selectFilter("Brands", "Apple", "Samsung");
//		selectFilter("Brands", "Apple", "Samsung", "TCL");
//		selectFilter("Brands", "ALL");

	}

	private void selectFilter(String filterName, String... filterValue) throws Exception {
		scrollTillFilter();
		driver.findElement(By.xpath("//legend[contains(text(), '" + filterName + "')]")).click();
		for (String eachFilterValue : filterValue) {
			if (eachFilterValue.equalsIgnoreCase("All") && filterName.equals("Brands")) {
				selectAllBrands();
			} else {
				driver.findElement(By.xpath("//span[contains(text(), '" + eachFilterValue + "') and @class='filter-display-name']")).click();
			}
			scrollTillFilter();
		}
	}

	private void scrollTillFilter() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView({block: \"center\"});",
				driver.findElement(By.xpath("//*[@class='heading-5 sidenav-title' and text()=' Filters ']")));

	}

	private void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("Mozila")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	private void launchPortal(String portalUrl) throws InterruptedException {
		driver.get(portalUrl);
		Thread.sleep(5000);
	}

	private void selectAllBrands() {
		int	brandSize= driver.findElements(By.xpath("//div[@role='group' and @aria-label='Brands']//mat-checkbox")).size();
		for (int i = 1; i <= brandSize; i++) {
			scrollTillFilter();
			driver.findElement(By.xpath("//div[@role='group' and @aria-label='Brands']//mat-checkbox[" + i + "]//label")).click();
		}

	}

}
