package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleDisSeaBoxOrDropDownEleusingDebugger {
	
//	Handle disappearing search box or drop down elements using debugger
//  Like in Flipkart when you search something(may be Macbook) & you want to inspect the prompted values...
//	it won't allow to inspect even if yiu try with F8 function.
	
//  to Resolve this use debugger from JavaScript
//  setTimeout(()=>{debugger;},5000)----> here is will freeze the web page after 5 sec....within this 5 sec 
//	search any thing in search box & wait for debugger to freeze the page...& now take the xpath.
	
	@Test
	public void HandleDisSeaBoxOrDropDownEleusingDebuggerTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Launching browser using SeleniumManager
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Macbook");
		driver.wait(1000);
		driver.findElement(By.xpath("(//div[@class='YGcVZO _2VHNef'])[4]")).click();
		
	}

}
