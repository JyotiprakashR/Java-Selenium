package java8_Concepts;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class TestRunner {

	@Test
	public void test() {
		List<String> list = Arrays.asList("Welcome", "to", "NY");

		Consumer<String> con = a -> {
			System.out.println(a);
		};
		Consumer<String> con1 = b -> {
			System.out.println(b.toUpperCase());
		};
		// list.forEach(con);

		// or
		// list.forEach( a-> System.out.println(a));
		list.forEach(con1);

		// list.forEach(con.andThen(con1));

		// USE CASE-1
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		// element.forEach( (a)->{System.out.println(a.getText());});

		elements.forEach((element) -> {

			if (!element.getText().isBlank()) {
				System.out.println(element.getText());
			}
			Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		});

		
		
		driver.quit();
	}

}
