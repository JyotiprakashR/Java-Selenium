package testNG_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelConceptsWithSelenium {
	
	
	WebDriver driver;
	
	@Test()
	public void firstOrder() {
		System.out.println("@Test---firstOrder & current thread id is--"+Thread.currentThread().getId()+" & Thread Name is--"+Thread.currentThread().getName());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	
	@Test
	public void secondOrder() {
		
		System.out.println("@Test---secondOrder & current thread id is--"+Thread.currentThread().getId()+" & Thread Name is--"+Thread.currentThread().getName());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
	}
	
	@Test
	public void thirdOrder() {
		System.out.println("@Test---thirdOrder & current thread id is--"+Thread.currentThread().getId()+" & Thread Name is--"+Thread.currentThread().getName());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	
	@Test
	public void fourthOrder() {
		System.out.println("@Test---fourthOrder & current thread id is--"+Thread.currentThread().getId()+" & Thread Name is--"+Thread.currentThread().getName());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	

}
